n = int(input())

# Please write your code here.
def check(n):
    global answer
    if (n == 0):
        # print(array)
        answer = answer + 1
        return
    
    elif (n < 0):
        return
    
    for i in range(1, 5):
        # array.append(i)
        check(n-i)
        # array.pop()

# array = []
answer = 0
check(n)
print(answer)