class Solution:
    def numberOfAlternatingGroups(self, colors: List[int]) -> int:
        c=colors
        n=len(c)
        alt=0
        for i in range(len(c)):
            alt+=(c[i]!=c[i-1] and c[i]!=c[(i+1)%n])
        return alt
