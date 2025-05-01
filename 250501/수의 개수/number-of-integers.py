'''
요구 조건
- 입력 값이 배열에 몇 개 있는지

접근 방법
- 1. 2중 for
- 2. 이진 탐색 (lower, upper)
- 3. 딕셔너리

선택 방법
- 2. 이진 탐색
- 이유: 지금은 연습 중이니까.
- 복잡도: O(MlogN)
- 3. 딕셔너리 
- 이유: 이건 구현이 더 쉬운 듯
- 복잡도: O(N+M)

소요 시간
- 30분

발전
- upper는 right에서 점차 가는데 가장 마지막 target에서 멈추는 것
- lower는 right에서 점차 가는데 가장 첫번째 target에서 멈추는 것
- print(arr_dict.get('a', 0))  # 출력: 2  → 'a'는 있으니까 값 반환
- from collections import defaultdict
'''

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

'''
arr_dict = dict()
for i in arr:
    if i in arr_dict.keys():
        arr_dict[i] = arr_dict[i] + 1
    else:
        arr_dict[i] = 1

for _ in range(m):
    target = int(input())
    if target in arr_dict.keys():
        print(arr_dict[target])
    else:
        print(0)
'''