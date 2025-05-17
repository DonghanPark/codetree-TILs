n, m = tuple(map(int, input().split()))

a_info = [tuple(map(int, input().split())) for _ in range(n)]
b_info = [tuple(map(int, input().split())) for _ in range(m)]

def simul_dist(info: list[tuple[int, int]]) -> list[int]:
    dist_info = []
    curr_dist = 0

    for v, t in info:
        for _ in range(t):
            curr_dist += v
            dist_info.append(curr_dist)

    return dist_info

def set_top(a, b):
    if a > b:
        return 1
    elif b > a:
        return 2
    else:
        return 0

def count_switch_top(a_dist_info: list[int], b_dist_info: list[int]) -> int:
    total_time = len(a_dist_info)
    switch_count = 0
    top = 0 # 0: draw, 1: A, 2: B
    for i in range(total_time):
        if top == 1 and a_dist_info[i] <= b_dist_info[i]:
            switch_count += 1
            top = set_top(a_dist_info[i], b_dist_info[i])
        elif top == 2 and a_dist_info[i] >= b_dist_info[i]:
            switch_count += 1
            top = set_top(a_dist_info[i], b_dist_info[i])
        elif top == 0 and a_dist_info[i] != b_dist_info[i]:
            switch_count += 1 
            top = set_top(a_dist_info[i], b_dist_info[i])

    return switch_count

a_dist_info = simul_dist(a_info)
b_dist_info = simul_dist(b_info)
switch_count = count_switch_top(a_dist_info, b_dist_info)
print(switch_count)
