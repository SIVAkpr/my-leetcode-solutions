# Last updated: 3/21/2026, 3:40:36 PM
# The isBadVersion API is already defined for you.
# def isBadVersion(version: int) -> bool:

class Solution:
    def firstBadVersion(self, n: int) -> int:
        a = 1
        b = n
        while a < b:
            mid = a + (b - a) // 2
            print(mid)
            if isBadVersion(mid):
                b = mid
            else:
                a = mid + 1
        return a
