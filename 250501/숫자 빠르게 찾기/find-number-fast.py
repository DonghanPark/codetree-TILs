'''
요구 사항
- 입력 받은 수가 배열에서 몇 번째인지, 없다면 -1

접근 방식
- 1. 2중 for
- 2. 이진탐색

선택 방식
- 2. 이진탐색
- O(mlogn)으로 끝남
'''

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