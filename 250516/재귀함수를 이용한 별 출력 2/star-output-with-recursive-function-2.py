n = int(input())

def print_star(num, plus):
    if num < 1 or num > n:
        return
    print(*(["*"]*num))
    print_star(num + plus, plus)

print_star(n, -1)
print_star(1, 1)