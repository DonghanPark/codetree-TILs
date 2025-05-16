n = int(input())
infos = [list(map(int, input().split())) for _ in range(n)]

for i in range(n):
    infos[i].append(i+1)

infos.sort(key=lambda x:(x[0], -x[1]))

for info in infos:
    print(*info)