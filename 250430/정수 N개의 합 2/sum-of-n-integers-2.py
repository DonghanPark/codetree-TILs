'''
요구사항
- 수열에서 연속하는 k개의 원소들의 합 중 가장 큰 값

접근방식
- 1. 2중 for
- 2. 누적합, 가장 큰 값을 구하기 위한 for

선택방식
- 2번
- 사유: 시간 복잡도
-- 2중 for은 최악의 경우 O(n^2). 2번의 경우 O(2n) = O(n)

고민한 부분
- 개념만 보고 막상 풀려고 하니 index가 가장 많이 고민되었음
- 다시 개념을 확인하니 원래 arr와 sum 둘 다 첫 원소에 0을 추가해서 index 계산을 편하게 하더라

소요시간
- 약 30분. index 생각에 시간 많이 소요

추가로 다뤄 볼 부분
- sys.maxsize
'''

n, k = map(int, input().split())
arr = list(map(int, input().split()))
psum = [0] * (n + 1)

# memorization
for i in range(n):
    psum[i+1] = psum[i] + arr[i]

# check max gap
max_num = 0
for i in range(k, n + 1):
    gap = psum[i] - psum[i-k]
    max_num = max(max_num, gap)

print(max_num)

