n = int(input())

# Please write your code here.
def check(n):
    global answer
    if (n == 0):
        answer = answer + 1
        return
    
    elif (n < 0):
        return
    
    for i in range(1, n+1):
        check(n-i)

answer = 0
check(n)
print(answer)