# Last updated: 3/21/2026, 3:40:21 PM
class Solution:
    def partitionDisjoint(self, nums: List[int]) -> int:
        n=nums
        l_max=n[0]
        c_max=n[0]
        partition=0
        for i in range(1,len(n)):
            c_max=max(c_max,n[i])
            if n[i]<l_max:
                l_max=c_max
                partition =i
        return partition+1