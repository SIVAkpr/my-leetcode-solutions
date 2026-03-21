# Last updated: 3/21/2026, 3:40:06 PM
class Solution:
    def freqAlphabets(self, s: str) -> str:
        ans=""
        l=len(s)
        i=0
        while i<l:
            if i+2<len(s) and s[i+2]=='#':
                ans+=chr(int(s[i:i+2])+ord('a')-1)
                i+=3
            else:
                ans+=chr(int(s[i])+ord('a')-1)
                i+=1
        return ans