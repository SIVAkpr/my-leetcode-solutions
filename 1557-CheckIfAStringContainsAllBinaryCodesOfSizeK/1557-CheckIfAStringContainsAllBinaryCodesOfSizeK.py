# Last updated: 3/21/2026, 3:40:00 PM
class Solution:
    def hasAllCodes(self, s: str, k: int) -> bool:
        if len(s)< 2**k:
            return False
        rst=set()
        for i in range(len(s)-k+1):
            rst.add(s[i:i+k])
        return len(rst)== 2**k