import sys

arr = list(map(int, input().split()))
n = len(arr)

def calc_gap(i, j, k):
    sum1 = arr[i] + arr[j] + arr[k]
    sum2 = sum(arr) - sum1
    gap = abs(sum1 - sum2)
    return gap

min_gap = sys.maxsize
for i in range(n):
    for j in range(i + 1, n):
        for k in range(i + 2, n):
            gap = calc_gap(i, j, k)
            
            if gap < min_gap:
                min_gap = gap

print(min_gap)