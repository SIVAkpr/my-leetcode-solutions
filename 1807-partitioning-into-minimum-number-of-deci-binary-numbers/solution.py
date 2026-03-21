class Solution:
    def minPartitions(self, n: str) -> int:
        rst=0
        # n=int(n)
        # while n>0:
        for i in range(len(n)):
            n1=int(n[i])
            a=n1%10
            rst=max(rst,a)
            # n=n//10
        return rst

