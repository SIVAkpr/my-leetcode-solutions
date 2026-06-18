1class Solution:
2    def arrangeCoins(self, n: int) -> int:
3        i=0
4        while(n>0):
5            i+=1
6            n=n-i
7        if n==0:
8            return i
9        return i-1