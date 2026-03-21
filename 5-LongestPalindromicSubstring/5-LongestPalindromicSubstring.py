# Last updated: 3/21/2026, 3:41:31 PM
class Solution:
    def longestPalindrome(self, s: str) -> str:
        def check_pal(n):
            if(n==n[::-1]):
                return 1
        if(s==""):
            return 0
        elif(len(s)<=1):
            return s
        lst=[]
        a=len(s)
        for j in range(a):
            a=""
            for i in s[j:]:
                a=a+i
                if(check_pal(a)==1 and len(a)>=2):
                    lst.append(a)
        if(len(lst)==0):
            return s[0]
        else:
            return max(lst,key=len)