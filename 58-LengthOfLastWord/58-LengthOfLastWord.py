# Last updated: 3/21/2026, 3:41:05 PM
class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        a=s.split(" ")
        c=len(a)        
        b=''
        print(a)
        for i in range(1,c+1):
            if a[-i]!=b:
                return len(a[-i])
                break
                