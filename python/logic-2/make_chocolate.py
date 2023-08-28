# We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each). Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.

# make_chocolate(4, 1, 9) → 4
# make_chocolate(4, 1, 10) → -1
# make_chocolate(4, 1, 7) → 2

def make_chocolate(small, big, goal):
    max_big = goal // 5

    big_to_use = min(max_big, big)

    remaining_goal = goal - (big_to_use * 5)

    small_needed = remaining_goal

    if small_needed <= small:
        return small_needed
    else:
        return -1
