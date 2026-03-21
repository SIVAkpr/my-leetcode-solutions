# Last updated: 3/21/2026, 3:39:43 PM
class Solution:
    def minOperations(self, s: str) -> int:
        l=len(s)
        cnt=0
        s=list(s)
        for i in range(1,len(s)):
            if s[i]==s[i-1]:
                cnt+=1
                if s[i]=='0':
                    s[i]='1'
                else:
                    s[i]='0'
        return min(cnt,l-cnt)