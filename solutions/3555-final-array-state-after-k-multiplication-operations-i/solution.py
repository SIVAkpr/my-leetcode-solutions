class Solution:
    def getFinalState(self, nums: List[int], k: int, multiplier: int) -> List[int]:

        n=nums
        m=multiplier
        for i in range(k):
            a=min(n)
            b=n.index(a)
            c=a*m
            n[b]=c
        return n

