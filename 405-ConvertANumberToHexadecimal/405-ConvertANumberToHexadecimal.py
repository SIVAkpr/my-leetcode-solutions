# Last updated: 3/21/2026, 3:40:33 PM
class Solution:
    def toHex(self, num: int) -> str:
        if num==0:
            return "0"
        dit={10:'a',11:'b',12:'c',13:'d',14:'e',15:'f'}
        ans=""
        n=num & 0xFFFFFFFF
        # print(n)
        while n>0:
            ad=n%16
            if ad >9:
                ad=dit[ad]
            ans=str(ad)+ans
            n//=16
        return ans