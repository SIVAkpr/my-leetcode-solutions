# Last updated: 3/21/2026, 3:41:03 PM
class Solution:
    def addBinary(self, a: str, b: str) -> str:
        c=int(a,2)+int(b,2)
        return str(format(c,'b'))