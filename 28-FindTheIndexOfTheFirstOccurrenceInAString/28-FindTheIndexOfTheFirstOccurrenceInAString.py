# Last updated: 3/21/2026, 3:41:18 PM
class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        h=haystack
        n=needle
        if n in h:
            a=h.find(n)
            return a
        else:
            return -1