'''
# 요구사항
- 주어진 자리 수에서 아름다운 수의 개수
- 각 자리의 범위 [1, 4]
- 111 또한 아름다운 수
    - 1이 한 자리만 차지하기 때문

# 접근 가능 방식
- 1. 숫자를 만들고(재귀) 아름다운 숫자인지 확인
- 2. 자리 수를 빼는 방식(재귀)

# 선택 방식
- 2. 자리 수를 빼는 방식
- 이유: 1의 숫자를 만드는 코드 만으로 정답 판단 가능

# 주석
- 아름다운 수를 출력해야 하는 문제의 경우 사용

# 총 소요 시간
- 약 40분

# 다음에 이 문제를 푼다면
- 문제의 조건을 잘 읽을 것
- 잘 읽지 않아 20분 추가 소요
'''

n = int(input())

def check(n):
    global answer

    # termination condition
    if (n == 0):
        # print(array)
        answer = answer + 1
        return
    elif (n < 0):
        return
    
    # recursive call
    for i in range(1, 5):
        # array.append(i)
        check(n-i)
        # array.pop()

# array = list()
answer = 0
check(n)
print(answer)