class Solution:
    def search(self, nums: List[int], target: int) -> int:
        k=0
        for i in range(len(nums)):
            if nums[i]==target:
                return i
            if target not in nums:
                return -1
        
