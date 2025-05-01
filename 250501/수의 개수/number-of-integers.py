n, m = tuple(map(int, input().split()))
arr = list(map(int, input().split()))

def check_upper_bound(target):
    start, end = 0, n-1
    max_idx = -1
    while(start <= end):
        mid = (start + end) // 2
        if arr[mid] <= target:
            start = mid + 1
            max_idx = max(max_idx, mid)
        else:
            end = mid - 1
    return max_idx

def check_lower_bound(target):
    start, end = 0, n-1
    min_idx = n
    while(start <= end):
        mid = (start + end) // 2
        if arr[mid] >= target:
            end = mid - 1
            min_idx = min(min_idx, mid)
        else:
            start = mid + 1
    return min_idx

for _ in range(m):
    target = int(input())
    count = check_upper_bound(target)-check_lower_bound(target) + 1
    print(count)