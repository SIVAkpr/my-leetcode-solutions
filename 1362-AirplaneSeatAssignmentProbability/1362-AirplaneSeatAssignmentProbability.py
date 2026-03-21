# Last updated: 3/21/2026, 3:40:07 PM
class Solution:
    def nthPersonGetsNthSeat(self, n: int) -> float:
        if n>=2:
            return 1/2
        else:
            return float(n)