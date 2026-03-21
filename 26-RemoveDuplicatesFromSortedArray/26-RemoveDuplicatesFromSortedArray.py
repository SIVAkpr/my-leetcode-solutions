# Last updated: 3/21/2026, 3:41:20 PM
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        nums[:]=sorted(set(nums))
        return len(nums)    
