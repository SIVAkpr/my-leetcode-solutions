class Solution:
    def myPow(self, x: float, n: int) -> float:
        rst=1
        if n==0:
            return 1
        if(n<0):
            n=-n
            x=1/x
        while n>0:
            if n%2==1:
                rst*=x
            x*=x
            n//=2
        return rst
