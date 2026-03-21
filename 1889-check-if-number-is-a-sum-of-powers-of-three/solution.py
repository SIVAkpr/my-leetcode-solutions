class Solution:
    def checkPowersOfThree(self, n: int) -> bool:
        while n:
            if n%3 >1:
                return False
            n=n//3
            print(n)
        return True
        
