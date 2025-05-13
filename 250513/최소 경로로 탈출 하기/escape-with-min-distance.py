from collections import deque

n, m = tuple(map(int, input().split()))
grid = [list(map(int, input().split())) for _ in range(n)]

dxs = [0, 0, -1, 1]
dys = [-1, 1, 0, 0]

visited = [[0]*m for _ in range(n)]
step = [[0]*m for _ in range(n)]

q = deque()

def init():
    q.append((0, 0))
    visited[0][0] = 1

def in_range(x, y):
    return 0 <= x < n and 0 <= y < m

def can_go(x, y):
    return in_range(x, y) and visited[x][y] == 0 and grid[x][y] == 1

def bfs():
    while(q):
        cx, cy = q.popleft()

        for dx, dy in zip(dxs, dys):
            nx, ny = cx + dx, cy + dy
            if can_go(nx, ny):
                q.append((nx, ny))
                visited[nx][ny] = 1
                step[nx][ny] = step[cx][cy] + 1 # visited 덕분에 최소가 보장되므로 min() 사용 X
    
    if step[n-1][m-1] == 0:
        step[n-1][m-1] = -1

def escape():
    init()
    bfs()
    print(step[n-1][m-1])

escape()