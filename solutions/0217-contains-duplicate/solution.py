class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        a=len(nums)
        b=set(nums)
        print(b)
        c=len(b)
        if a!=c:
            return True
        else:
            return False
