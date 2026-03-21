# Last updated: 3/21/2026, 3:39:37 PM
class Solution:
    def minimumDifference(self, nums: List[int], k: int) -> int:
        n=nums
        n.sort()
        minn=float('inf')
        for i in range(len(n)-k+1):
            minn=min(minn,n[i+k-1]-n[i])
        return minn