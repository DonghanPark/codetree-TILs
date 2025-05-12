from itertools import combinations
import copy

n, k, m = tuple(map(int, input().split()))
arr = [list(map(int, input().split())) for _ in range(n)]
points = [tuple(map(int, input().split()))]

dxs = [0, 0, -1, 1]
dys = [-1, 1, 0, 0]

total_visited = [[0]*n for _ in range(n)]

# 지우기
# 탐색
# visited sum

# 돌의 위치 저장
def make_stone_list():
    stone = []
    for i in range(n):
        for j in range(n):
            if arr[i][j] == 1:
                stone.append((i, j))
    
    return stone

def in_range(x, y):
    return 0 <= x < n and 0 <= y < n

def bfs(arr_erased, x, y, visited):
    # visited = [[0]*n for _ in range(n)]
    visited[x][y] = 1
    total_visited[x][y] = 1
    q = [(x, y)]

    while(q):
        cx, cy = q.pop(0)

        for dx, dy in zip(dxs, dys):
            nx, ny = cx + dx, cy + dy

            if in_range(nx, ny) and visited[nx][ny] == 0 and arr_erased[nx][ny] == 0:
                q.append((nx, ny))
                visited[nx][ny] = 1
                total_visited[nx][ny] = 1

    return visited

# m개 제거 모든 경우의 수
stone_to_erase_list = list(combinations(make_stone_list(), m))

# 돌 지우고 bfs
max_visited_count = 0
for stone_to_erase in stone_to_erase_list:
    arr_erased = copy.deepcopy(arr)
    for x, y in stone_to_erase:
        arr_erased[x][y] = 0
    
    # 시작 지점에 따라 bfs
    visited = [[0]*n for _ in range(n)]
    for x, y in points:
        visited = bfs(arr_erased, x-1, y-1, visited) # 0-based

    # 방문 수 확인
    visited_count = 0
    for temp in visited:
        visited_count += sum(temp)
    
    if visited_count > max_visited_count:
        max_visited_count = visited_count

print(max_visited_count)