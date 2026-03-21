# Last updated: 3/21/2026, 3:39:42 PM
class Solution:
    def truncateSentence(self, s: str, k: int) -> str:
        strr=s.split(" ")
        string=""
        a=" "
        for i in range(k):
            if(i!=(k-1)):
                string=string+strr[i]+a
            else:
                string+=strr[i]
        return string
        