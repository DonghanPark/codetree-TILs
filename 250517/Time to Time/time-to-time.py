a, b, c, d = tuple(map(int, input().split()))

MIN = 60

def cal_minute(h, m):
    return h*MIN + m

print(cal_minute(c, d) - cal_minute(a, b))