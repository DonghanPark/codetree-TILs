import sys
n, h, t = tuple(map(int, input().split()))
arr = list(map(int, input().split()))

min_charge = sys.maxsize
for i in range(n - t + 1):
    charge = 0
    for j in range(i, i + t):
        charge += abs(h-arr[j])
    
    if charge < min_charge:
        min_charge = charge

print(min_charge)