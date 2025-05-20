n = int(input())
arr = list(map(int, input().split()))
count = 0
for i in range(n):
    for j in range(i, n):
        avg = sum(arr[i:j + 1]) / (j - i + 1)
        
        if avg in arr[i:j + 1]:
            count += 1

print(count)