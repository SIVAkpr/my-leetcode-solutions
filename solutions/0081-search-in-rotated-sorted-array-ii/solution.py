class Solution:
    def search(self, nums: List[int], target: int) -> bool:
        l=len(nums)
        t=target
        if t not in nums:
            return False
        else:
            return True
