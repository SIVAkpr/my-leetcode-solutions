1class Solution:
2    def permuteUnique(self, nums: List[int]) -> List[List[int]]:
3        if len(nums)<=1:
4            return [nums]
5        permu=[]
6        for i in range(len(nums)):
7            curr=nums[i]
8            rem=nums[:i]+nums[i+1:]
9            for j in self.permuteUnique(rem):
10                if [curr]+j not in permu:
11                    permu.append([curr]+j)
12        return permu