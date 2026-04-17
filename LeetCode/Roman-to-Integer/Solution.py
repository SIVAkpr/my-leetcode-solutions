1class Solution:
2    def romanToInt(self, s: str) -> int:
3        dit={'M':1000,'D':500,'C':100,'L':50,'X':10,'V':5,'I':1}
4        s=s[::-1]
5        curr=dit[s[0]]
6        s=s[1:]
7        ans=curr
8        for i in s:
9            if(dit[i]>=curr):
10                ans+=dit[i]
11            else:
12                ans=ans-dit[i]
13            curr=dit[i]
14        return ans