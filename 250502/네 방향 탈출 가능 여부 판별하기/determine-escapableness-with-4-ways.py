n, m = tuple(map(int, input().split()))
arr = [list(map(int, input().split())) for _ in range(n)]
visited = [[0]*m for _ in range(n)]
q = [(0, 0)]
dxs = [0, 0, -1, 1]
dys = [-1, 1, 0, 0]

def in_range(dx, dy):
    if (0 <= dx < n) and (0 <= dy < m):
        return True
    else:
        return False

def can_go(dx, dy):
    if not in_range(dx, dy):
        return False
    
    if visited[dx][dy] == 1:
        return False
    
    if arr[dx][dy] == 0:
        return False
    
    return True

def push(dx, dy):
    q.append((dx, dy))
    visited[dx][dy] = 1

def bfs():
    while(q):
        cdx, cdy = q.pop()

        for dx, dy in zip(dxs, dys):
            ndx, ndy = cdx + dx, cdy + dy

            if can_go(ndx, ndy):
                push(ndx, ndy)

bfs()

if visited[n-1][m-1] == 1:
    print(1)
else:
    print(0)