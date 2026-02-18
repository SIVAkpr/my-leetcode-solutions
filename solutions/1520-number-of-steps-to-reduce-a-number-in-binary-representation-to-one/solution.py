class Solution:
    def numSteps(self, s: str) -> int:
        def bin2dec(n):
            ans=0
            n=n[::-1]
            for i in range(len(n)):
                if n[i]=="1":
                    ans+=(2**i)
            return ans
        stp=0
        x=bin2dec(s)
        while(x!=1):
            if x%2!=0:
                x=x+1
                stp+=1
            if x%2==0:
                x=x//2
                stp+=1
        return stp
            
