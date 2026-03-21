class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        nums.append(target)
        num=sorted(nums)
        for i in range(len(num)):
            if num[i]==target:
                return i
