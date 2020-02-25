package com.oa;

public class MaximumAreaServingCake {
    //No solution found

    //https://leetcode.com/discuss/interview-question/348510

    /*
    # https://leetcode.com/discuss/interview-question/348510/google-online-assessment-maximum-area-serving-cake
def maximumAreaServingCake(radii, numberOfGuests):
    areas = [math.pi * r * r for r in radii]
    def possible(x):
        k = 0
        for a in areas:
            k += a // x
            if k >= numberOfGuests:
                return True
        return False

    l, r = 0, max(areas)
    while l + 1e-5 <= r:
        x = (l + r) / 2
        if possible(x):
            l = x
        else:
            r = x
    return round(x, 4)

# Example 1.
radii = [ 1, 1, 1, 2, 2, 3]
numberOfGuests = 6
print(maximumAreaServingCake(radii, numberOfGuests))
# Output: 7.0686

# Example 2.
radii = [4, 3, 3]
numberOfGuests = 3
print(maximumAreaServingCake(radii, numberOfGuests))
# Output: 28.2743

# Example 3.
radii = [6, 7]
numberOfGuests = 12
print(maximumAreaServingCake(radii, numberOfGuests))
# Output: 21.9911
     */
}
