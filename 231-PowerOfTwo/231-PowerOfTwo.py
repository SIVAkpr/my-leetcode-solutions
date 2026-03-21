# Last updated: 3/21/2026, 3:40:44 PM
class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
        a=[2,4,8]
        if (n==1) or (n==2):
            return True
        while(1):
            n=n/2
            if(n in a):
                return True
                break
            elif(n<8):
                if (n not in a):
                    return False
                    break
                break
        