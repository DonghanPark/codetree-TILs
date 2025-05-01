n, m = map(int, input().split())
arr = list(map(int, input().split()))

def search_num(target):
    start = 0
    end = n-1

    while(start <= end):
        mid = (start + end) // 2
        if arr[mid] == target:
            return mid + 1
        elif arr[mid] > target:
            end = mid - 1
        else:
            start = mid + 1
    
    return -1

for _ in range(m):
    target = int(input())
    print(search_num(target))
