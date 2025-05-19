n, k = tuple(map(int, input().split()))
score = [0] * (10001)

for _ in range(n):
    pos, alpha = input().split()
    pos = int(pos)
    if alpha == "G":
        score[pos] = 1
    else:
        score[pos] = 2

num_sum = sum(score[1:k+2])
max_sum = num_sum
for i in range(k+2, 10001):
    num_sum -= score[i-k]
    num_sum += score[i]

    if num_sum > max_sum:
        max_sum = num_sum

print(max_sum)