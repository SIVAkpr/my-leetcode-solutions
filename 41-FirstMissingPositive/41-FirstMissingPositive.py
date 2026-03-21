# Last updated: 3/21/2026, 3:41:12 PM
class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        n=set(nums)
        i=1
        while True:
            if i not in n:
                return i
            i=i+1
        # for i in range(1,len(nums)+2):
        #     if i not in nums:
        #         return i
        # a=max(nums)+1
        # return a