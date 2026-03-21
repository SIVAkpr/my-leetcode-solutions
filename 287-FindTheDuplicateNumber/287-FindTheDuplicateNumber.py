# Last updated: 3/21/2026, 3:40:34 PM
class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        seen=set()
        for i in nums:
            if i in seen:
                return i
            seen.add(i)
        print("""for i in range(len(nums)):
            if nums[i] in nums[i+1:]:
                return nums[i]
                break
            else:
                continue""")