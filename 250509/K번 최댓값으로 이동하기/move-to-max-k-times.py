from collections import deque

n, k = tuple(map(int, input().split()))
grid = [list(map(int, input().split())) for _ in range(n)]

dxs = [0, 0, -1, 1]
dys = [-1, 1, 0, 0]

q = deque()

def in_range(x, y):
    return 0 <= x < n and 0 <= y < n

def bfs(x, y):
    q = deque()
    q.append((x, y))
    visited = [[0] * n for _ in range(n)]
    visited[x][y] = 1
    max_num = 0
    max_point = (x, y)
    while(q):
        cx, cy = q.popleft()
        # print(cx, cy)
        
        for dx, dy in zip(dxs, dys):
            nx, ny = cx + dx, cy + dy
            if in_range(nx, ny) and grid[nx][ny] < grid[x][y] and visited[nx][ny] == 0: # can_go
                q.append((nx, ny))
                visited[nx][ny] = 1

                if grid[nx][ny] > max_num: # 가장 큰 값
                    max_num = grid[nx][ny]
                    max_point = (nx, ny)
                elif grid[nx][ny] == max_num:
                    if nx < max_point[0]: # 행
                        max_point = (nx, ny)
                    elif nx == max_point[0] and ny < max_point[1]: # 열
                        max_point = (nx, ny)
        # print(max_num, max_point)

    return max_point

x, y = tuple(map(int, input().split()))
q = deque()
q.append((x-1, y-1))
while(k):
    cx, cy = q.popleft()
    nx, ny = bfs(cx, cy)
    # print(nx, ny)
    q.append((nx, ny))
    k -= 1

answer = q.popleft()
print(answer[0]+1, answer[1]+1)


