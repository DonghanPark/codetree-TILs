from collections import deque

n, k = tuple(map(int, input().split()))
grid = [list(map(int, input().split())) for _ in range(n)]

q = deque()

def bfs():
    global k
    while(q):
        cx, cy = q.popleft()

        max_num = 0
        max_point = (cx, cy)
        for i in range(n):
            for j in range(n):
                if grid[i][j] < grid[cx][cy] and grid[i][j] > max_num:
                    max_num = grid[i][j]
                    max_point = (i, j)

        q.append(max_point)
        k -= 1

        if (max_point[0] == cx and max_point[1] == cy) or k == 0:
            print(*max_point)
            return

x, y = tuple(map(int, input().split()))
q.append((x-1, y-1))
bfs()
