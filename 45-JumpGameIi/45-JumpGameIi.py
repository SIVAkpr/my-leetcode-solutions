# Last updated: 3/21/2026, 3:41:09 PM
class Solution:
    def jump(self, nums: List[int]) -> int:
        n=nums
        j=0
        cru=0
        far=0
        for i in range(len(n)-1):
            far=max(far,i+n[i])
            if i==cru:
                j=j+1
                cru=far
            if cru>=len(n)-1:
                break
        return j