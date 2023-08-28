# Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.

# lone_sum(1, 2, 3) → 6
# lone_sum(3, 2, 3) → 2
# lone_sum(3, 3, 3) → 0

def lone_sum(a, b, c):
    result = 0

    if a == b and b == c:
        return result

    if a != b and b != c:
        result = a + b + c

    if a == b:
        result = c
    if b == c:
        result = a
    if a == c:
        result = b

    return result
