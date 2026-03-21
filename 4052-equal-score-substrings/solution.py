class Solution:
    def scoreBalance(self, s: str) -> bool:
        def num(c):
           return ord(c)-ord('a')+1
        tot=sum(num(c) for c in s)
        l_sum=0
        for i in range(len(s)-1):
            l_sum+=num(s[i])
            r_sum=tot-l_sum
            if l_sum==r_sum:
                return True
        return False
            
