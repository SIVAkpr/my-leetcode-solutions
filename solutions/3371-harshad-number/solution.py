class Solution:
    def sumOfTheDigitsOfHarshadNumber(self, x: int) -> int:
        n=0
        s=x
        while(x!=0):
            a=x%10
            n=n+a
            x=x//10
        if((s%n)==0):
            return n
        else:
            return -1
