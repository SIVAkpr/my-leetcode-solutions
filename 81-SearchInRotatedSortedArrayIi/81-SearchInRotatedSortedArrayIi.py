# Last updated: 3/21/2026, 3:40:55 PM
class Solution:
    def search(self, nums: List[int], target: int) -> bool:
        l=len(nums)
        n=nums
        a=0
        for i in n:
            if i==target:
                a=a+1
        if a>0:
            return True
        else:
            return False