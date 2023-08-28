# Given three ints, a b c, return True if one of b or c is "close" (differing from a by at most 1), while the other is "far", differing from both other values by 2 or more. Note: abs(num) computes the absolute value of a number.

# close_far(1, 2, 10) → True
# close_far(1, 2, 3) → False
# close_far(4, 1, 3) → True

def close_far(a, b, c):
    a_b_difference = abs(a - b)
    a_c_difference = abs(a - c)
    b_c_difference = abs(b - c)

    return ((a_b_difference <= 1 and a_c_difference >= 2 and b_c_difference >= 2) !=
            (a_c_difference <= 1 and a_b_difference >= 2 and b_c_difference >= 2))
