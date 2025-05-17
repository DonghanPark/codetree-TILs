n, m = tuple(map(int, input().split()))

def parse_input(n: int) -> list[int]:
    DIRECTION_OFFSET = {"L":-1, "R":1}

    moves = list()
    for _ in range(n):
        direction, sec = input().split()
        direction = DIRECTION_OFFSET.get(direction)
        sec = int(sec)

        moves.append((direction, sec))

    return moves

def apply_move(moves: list[int]) -> list[int]:
    move_info = list()

    curr_pos = 0
    for direction, sec in moves:
        for _ in range(sec):
            curr_pos += direction
            move_info.append(curr_pos)
    
    return move_info

def calc_meet_moment(a_move_info: list[int], b_move_info: list[int]) -> int:
    for i in range(len(a_move_info)):
        if a_move_info[i] == b_move_info[i]:
            return i+1
    return -1

a_moves = parse_input(n)
a_move_info = apply_move(a_moves)

b_moves = parse_input(m)
b_move_info = apply_move(b_moves)

answer = calc_meet_moment(a_move_info, b_move_info)
print(answer)