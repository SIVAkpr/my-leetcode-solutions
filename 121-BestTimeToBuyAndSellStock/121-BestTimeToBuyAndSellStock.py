# Last updated: 3/21/2026, 3:40:51 PM
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if not prices:
            return 0
        min_pro=float('inf')
        max_pro=0
        for i in prices:
            if i<min_pro:
                min_pro=i
            elif i-min_pro > max_pro:
                max_pro=i-min_pro
        return max_pro
        # for i in range(len(prices)-1):
        #     buy=prices[i]
        #     for j in range(i+1,len(prices)):
        #         sells=prices[j]-buy
        #         ans=max(ans,sells)
        # if ans>=0:
        #     return ans
        # else:
        #     return 0