# Last updated: 3/21/2026, 3:39:28 PM
class Solution:
    def longestContinuousSubstring(self, s: str) -> int:
        l=1
        res=1
        if not s:
            return 0
        for i in range(1,len(s)):
            if ord(s[i-1])+1 == ord(s[i]):
                l=l+1
                res=max(res,l)
            else:
                l=1
        return res