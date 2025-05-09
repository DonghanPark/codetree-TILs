n, k = tuple(map(int, input().split()))
arr = [list(map(int, input().split())) for _ in range(n)]
points = [tuple(map(int, input().split())) for _ in range(k)]
visited = [[0] * n for _ in range(n)]

dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]

count = 0

def in_range(x, y):
    return 0 <= x < n and 0 <= y < n

def bfs(q):
    global count
    while(q):
        cx, cy = q.pop(0)

        for i in range(4):
            nx, ny = cx + dx[i], cy + dy[i]

            if in_range(nx, ny) and visited[nx][ny] == 0 and arr[nx][ny] == 0:
                q.append((nx, ny))
                visited[nx][ny] = 1
                count += 1

for point in points:
    q = [(point[0]-1, point[1]-1)]
    if visited[point[0]-1][point[1]-1] == 0:
        bfs(q)
        visited[point[0]-1][point[1]-1] = 1

print(count)