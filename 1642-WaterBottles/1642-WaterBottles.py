# Last updated: 3/21/2026, 3:39:52 PM
class Solution:
    def numWaterBottles(self, numBottles: int, numExchange: int) -> int:
        n=numBottles
        x=numExchange
        l=1
        ans=n
        rmb=n
        while rmb>=x:
            a=rmb//x
            ans+=a
            rmb=rmb%x
            rmb=rmb+a
        return ans