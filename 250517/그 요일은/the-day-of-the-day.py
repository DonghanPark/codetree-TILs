m1, d1, m2, d2 = tuple(map(int, input().split()))
string = input()
days_of_weak = {"Mon":0, "Tue":1, "Wed":2, "Thu":3, "Fri":4, "Sat":5, "Sun":6}
#              0  1   2   3   4   5   6   7   8   9   10  11  12
num_of_days = [0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

def cal_days(m, d):
    return sum(num_of_days[:m]) + d

days = cal_days(m2, d2) - cal_days(m1, d1)
weeks = days // 7

if days % 7 >= days_of_weak[string]:
    print(weeks + 1)
else:
    print(weeks)