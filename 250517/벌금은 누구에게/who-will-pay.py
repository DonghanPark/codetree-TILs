n, m, k = tuple(map(int, input().split()))
penalties = [int(input()) for _ in range(m)]

def find_first_fine_student(penalties: list[int]) -> int:
    student = [k] * (n + 1)
    for penalty in penalties:
        student[penalty] -= 1

        if student[penalty] == 0:
            return penalty

    return -1

first_fine_student = find_first_fine_student(penalties)
print(first_fine_student)