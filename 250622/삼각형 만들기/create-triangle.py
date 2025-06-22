n = int(input())
points = [tuple(map(int, input().split())) for _ in range(n)]

min_dis = 0

for i in range(n):
    for j in range(i+1, n):
        for k in range(j+1, n):
            # horizon
            horizon_dis = 0
            if points[i][1] == points[j][1]:
                horizon_dis = abs(points[i][0] - points[j][0])
            elif points[j][1] == points[k][1]:
                horizon_dis = abs(points[j][0] - points[k][0])
            elif points[k][1] == points[i][1]:
                horizon_dis = abs(points[k][0] - points[i][0])
            
            # vertical
            vertical_dis = 0
            if points[i][0] == points[j][0]:
                vertical_dis = abs(points[i][1] - points[j][1])
            elif points[j][0] == points[k][0]:
                vertical_dis = abs(points[j][1] - points[k][1])
            elif points[k][0] == points[i][0]:
                vertical_dis = abs(points[k][1] - points[i][1])
            
            dis = horizon_dis * vertical_dis
            if dis != 0:
                min_dis = dis

print(min_dis)
