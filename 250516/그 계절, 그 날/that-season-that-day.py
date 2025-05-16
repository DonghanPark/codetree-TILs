y, m, d = tuple(map(int, input().split()))

days_of_month = [0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

def is_yun(y):
    if y % 4 == 0 and y % 100 == 0 and y % 400 == 0:
        return True
    elif y % 4 == 0 and y % 100 == 0:
        return False
    elif y % 4 == 0:
        return True
    else:
        return False

def get_season(m):
    if m >= 3 and m <= 5:
        return "Spring"
    elif m >= 6 and m <= 8:
        return "Summer"
    elif m >= 9 and m <= 11:
        return "Fall"
    else:
        return "Winter"

def exist_day(y, m, d):
    if y > 0 and (m >= 1 and m <= 12) and (d >= 1 and d <= days_of_month[m]):
        return True
    elif is_yun(y) and (d >= 1 and d <= 29):
        return True
    else:
        return False

if exist_day(y, m, d):
    season = get_season(m)
    print(season)
else:
    print(-1)