n, k = tuple(map(int, input().split()))
arr = list(map(int, input().split()))

num_sum = sum(arr[:k])
max_sum = num_sum
for i in range(k, n):
    num_sum += arr[i]
    num_sum -= arr[i-k]
    max_sum = max(max_sum, num_sum)

print(max_sum)
