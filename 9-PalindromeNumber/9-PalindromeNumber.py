# Last updated: 3/21/2026, 3:41:27 PM
class Solution:
    def isPalindrome(self, x: int) -> bool:
        x=str(x)
        y=x[::-1]
        if x==y:
            return True
        else:
            return False