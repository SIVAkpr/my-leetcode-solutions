class Solution:
    def largestOddNumber(self, num: str) -> str:
        x=""
        s=[]
        le=0
        s1=[]
        n=num
        k=-1
        b=["1","3","5","7","9"]
        for i in n:
            le=le+1
            s1.append(i)
            if i in b:
                s.append(i)
        print(s,s1)
        while abs(k) <= len(s1):
            if s1[k] in b:
                
                return "".join(s1[:k + len(s1) + 1])
            k -= 1

        return x
