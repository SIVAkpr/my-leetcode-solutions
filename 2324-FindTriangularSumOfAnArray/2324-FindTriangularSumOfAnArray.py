# Last updated: 3/21/2026, 3:39:32 PM
class Solution:
    def triangularSum(self, nums: List[int]) -> int:
        for k in range(0,len(nums)-1):
            for i in range(len(nums)-1):
                nums[i]=(nums[i+1]+nums[i])%10
        return nums[0]