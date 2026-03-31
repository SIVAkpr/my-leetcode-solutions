1class Solution:
2    def singleNumber(self, nums: List[int]) -> int:
3        k=nums[0]
4        for i in range(1,len(nums)):
5            k=k^nums[i]
6        return k