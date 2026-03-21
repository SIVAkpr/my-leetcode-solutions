# Last updated: 3/21/2026, 3:41:26 PM
class Solution:
    def maxArea(self, height: List[int]) -> int:
        h=height
        i=0
        j=len(h)-1
        max_v=0
        while i<j:
            h1=min(h[i],h[j])
            max_v=max(max_v,abs(i-j)*h1)
            if h[i]<h[j]:
                i=i+1
            else:
                j=j-1
        return max_v