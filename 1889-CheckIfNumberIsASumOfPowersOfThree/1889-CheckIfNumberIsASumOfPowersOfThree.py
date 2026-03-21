# Last updated: 3/21/2026, 3:39:48 PM
class Solution:
    def checkPowersOfThree(self, n: int) -> bool:
        while n:
            if n%3 >1:
                return False
            n=n//3
            print(n)
        return True
        