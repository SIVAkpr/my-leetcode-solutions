class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n=nums
        for j in range(len(nums)):
            for i in range(len(nums)-1):

                if n[i]>=nums[i+1]:
                    temp=n[i]
                    n[i]=nums[i+1]
                    nums[i+1]=temp


