# Last updated: 3/21/2026, 3:40:19 PM
class Solution:
    def repeatedNTimes(self, nums: List[int]) -> int:
        n=len(nums)/2
        #a=set(n)
        for i in range(len(nums)):
            q=nums.count(nums[i])
            if(q==n):
                return nums[i]
        return
