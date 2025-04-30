n, k = map(int, input().split())
arr = list(map(int, input().split()))
psum = [0] * (len(arr) + 1)

# memorization
for i in range(len(psum)-1):
    psum[i+1] = psum[i] + arr[i]

# check max gap
max_num = 0
for i in range(k, len(psum)):
    gap = psum[i] - psum[i-k]
    if max_num < gap:
        max_num = gap

print(max_num)

