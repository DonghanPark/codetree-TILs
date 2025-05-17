n = int(input())
MAX_SIZE = 1000
tile = [0] * (MAX_SIZE + 1)
DIRECTION_OFFSET = {"R":1, "L":-1}
location = 1

def calc_next_location(location, num, way):
    DIRECTION_OFFSET = {"R":1, "L":-1}
    OFFSET = DIRECTION_OFFSET[way] * num
    return location + OFFSET

for _ in range(n):
    num, way = tuple(input().split())
    num = int(num)

    next_location = location + DIRECTION_OFFSET[way] * (num - 1)
    for i in range(location, next_location + DIRECTION_OFFSET[way], DIRECTION_OFFSET[way]):
        tile[i] = DIRECTION_OFFSET[way]
    
    location = next_location

print(tile.count(-1), tile.count(1))
