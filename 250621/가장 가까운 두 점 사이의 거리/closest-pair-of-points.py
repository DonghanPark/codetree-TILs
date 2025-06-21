import sys

n = int(input())
segments = [tuple(map(int, input().split())) for _ in range(n)]

min_dis = sys.maxsize
for i in range(n):
    for j in range(i+1, n):
        dis = (segments[i][0] - segments[j][0])**2 + (segments[i][1] - segments[j][1])**2

        min_dis = min(min_dis, dis)

print(min_dis)