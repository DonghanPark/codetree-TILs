n = int(input())

arr = [0] * (201)

for _ in range(n):
    start, end = tuple(map(int, input().split()))
    for i in range(start+100, end+100):
        arr[i] += 1

print(max(arr))