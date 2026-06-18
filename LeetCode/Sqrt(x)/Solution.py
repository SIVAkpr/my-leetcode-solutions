1class Solution:
2    def mySqrt(self, x: int) -> int:
3        if x==0 or x==1:
4            return x
5        for i in range((x//2)+2):
6            if i*i==x:
7                return i
8            elif i*i>x:
9                return i-1