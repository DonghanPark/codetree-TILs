def parse_input() -> list[tuple[int, str]]:
    n = int(input())
    moves = []
    DIRECTION_OFFSET = {"R":1, "L":-1}

    for _ in range(n):
        steps, direction = tuple(input().split())
        moves.append((int(steps), DIRECTION_OFFSET.get(direction)))

    return moves

def apply_moves(moves: list[tuple[int, str]]) -> list[int]:
    MAX_SIZE = 200000
    tile_state = [0] * (MAX_SIZE + 1)
    curr_pos = MAX_SIZE // 2

    for steps, direction in moves:
        next_pos = curr_pos + (steps - 1) * direction
        for i in range(curr_pos, next_pos + direction, direction):
            tile_state[i] = direction
        curr_pos = next_pos
    
    return tile_state

def calc_tile(tile_state: list[int]) -> tuple[int, int]:
    WHITE = -1
    BLACK = 1

    count_of_while = tile_state.count(WHITE)
    count_of_black = tile_state.count(BLACK)

    return count_of_while, count_of_black

moves = parse_input()
tile_state = apply_moves(moves)
count_of_while, count_of_black = calc_tile(tile_state)

print(count_of_while, count_of_black)