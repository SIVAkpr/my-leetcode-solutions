class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        l=len(nums)
        j=0
        for i in range(len(nums)):
            if nums[i]!=0:
                nums[j]=nums[i]
                j=j+1
        for k in range(j,l):
            nums[k]=0
