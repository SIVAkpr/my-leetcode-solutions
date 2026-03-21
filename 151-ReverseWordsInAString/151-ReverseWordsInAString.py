# Last updated: 3/21/2026, 3:40:46 PM
class Solution:
    def reverseWords(self, s: str) -> str:
        ans=s.strip()
        a=ans.split(" ")
        res=""
        l=len(a)
        cnt=0        
        for i in range(l):
            res=res+a[l-i-1]
            res=res+" "
        l=len(res)
        z=" "
        res1=" ".join(res.split())
        return res1[:(l-1)]
