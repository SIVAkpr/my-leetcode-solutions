# Last updated: 3/21/2026, 3:39:25 PM
class Solution:
    def countDistinctIntegers(self, nums: List[int]) -> int:
        num=[]
        for i in nums:
            rev=int(str(i)[::-1])
            num.append(rev)
        print(num)
        n=num+nums
        a=set(n)
        return len(a)