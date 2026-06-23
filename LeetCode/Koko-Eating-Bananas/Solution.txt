1class Solution:
2    def minEatingSpeed(self, piles: List[int], h: int) -> int:
3        l,r=1,max(piles)
4        ans=max(piles)
5        while l<=r:
6            mid=(l+r)//2
7            hrsp=sum(math.ceil(p/mid) for p in piles)
8            if hrsp<=h:
9                ans=mid
10                r=mid-1
11            else:
12                l=mid+1
13        return ans
14