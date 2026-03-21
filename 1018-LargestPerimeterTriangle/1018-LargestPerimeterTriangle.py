# Last updated: 3/21/2026, 3:40:18 PM
class Solution:
    def largestPerimeter(self, nums: List[int]) -> int:
        n=nums
        n.sort()
        for i in range(len(n)-1,1,-1):
            if n[i-2]+n[i-1]>n[i]:
                return n[i-2]+n[i-1]+n[i]
        return 0