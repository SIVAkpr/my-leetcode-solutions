1class Solution:
2    def mySqrt(self, x: int) -> int:
3        l,r=1,x
4        while l<=r:
5            mid=(l+r)//2
6            if mid*mid < x:
7                l=mid+1
8            elif mid*mid > x:
9                r=mid-1
10            else:
11                return mid
12        return r
13        