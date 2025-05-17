n, m, k = tuple(map(int, input().split()))

student = [k] * (n + 1)

def check_fine_student(student: list[int]) -> int:
    for i in range(1, n + 1):
        if student[i] == 0:
            return i
    
    return 0

fine_student = -1
for _ in range(m):
    penalty = int(input())
    student[penalty] -= 1

    if student.count(0) > 0:
        fine_student = check_fine_student(student)
        break

print(fine_student)