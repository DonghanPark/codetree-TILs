import sys

n, s = tuple(map(int, input().split()))
arr = list(map(int, input().split()))

min_gap = sys.maxsize

for i in range(n - 1):
    for j in range(i + 1, n):
        num_sum = sum(arr) - arr[i] - arr[j]
        gap = abs(s - num_sum)
        min_gap = min(min_gap, gap)

print(min_gap)