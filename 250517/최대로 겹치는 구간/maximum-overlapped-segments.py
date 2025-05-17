n = int(input())
MAX_SIZE = 200
OFFSET = 100
arr = [0] * (MAX_SIZE + 1)

for _ in range(n):
    start, end = tuple(map(int, input().split()))
    start, end = start + OFFSET, end + OFFSET
    for i in range(start, end):
        arr[i] += 1

print(max(arr))