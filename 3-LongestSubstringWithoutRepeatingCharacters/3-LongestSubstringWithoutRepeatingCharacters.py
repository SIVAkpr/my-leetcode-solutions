# Last updated: 3/21/2026, 3:41:34 PM
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        l=len(s)
        lst=[]
        for j in range(l):
            a=""
            for i in s[j:]:
                if i in a:
                    break 
                a=a+i
            lst.append(a)
        if(s!=""):
            return len(max(lst,key=len))
        else:
            return 0
