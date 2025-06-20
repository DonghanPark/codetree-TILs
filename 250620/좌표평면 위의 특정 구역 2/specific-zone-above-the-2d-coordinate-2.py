import sys

n = int(input())
points = [tuple(map(int, input().split())) for _ in range(n)]

min_area = sys.maxsize

for i in range(n):
    x = []
    y = []
    for j in range(n):
        if i == j:
            continue
        
        x.append(points[j][0])
        y.append(points[j][1])

    x_dis = max(x) - min(x)
    y_dis = max(y) - min(y)

    min_area = min(min_area, x_dis * y_dis)

print(min_area)
