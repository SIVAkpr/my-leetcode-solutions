class Solution:
    def fractionToDecimal(self, numerator: int, denominator: int) -> str:
        n=numerator
        d=denominator
        if n==0:
            return "0"
        ans=""
        if (n<0) ^ (d<0):
            ans+="-"
        # elif d<0:
        #     ans+="-"
        n=abs(n)
        d=abs(d)
        ans+=str(n//d)
        remainder=n%d
        if remainder==0:
            return ans
        ans+="."
        dict1={}
        while remainder:
            if remainder in dict1:
                ans=ans[:dict1[remainder]]+'('+ans[dict1[remainder]:]+')'
                break
            dict1[remainder]=len(ans)
            remainder=remainder*10
            ans+=str(remainder//d)
            remainder=remainder%d
        return ans
