# Last updated: 3/21/2026, 3:39:06 PM
class Solution:
    def minDistinctFreqPair(self, nums: list[int]) -> list[int]:
        dit={}
        n=nums
        if len(set(n))==len(n):
            return [-1,-1]
        for i in n:
            dit[i]=dit.get(i,0)+1
        u_dit=sorted(dit.keys())
        l=len(u_dit)
        print(u_dit)
        for i in range(l):
            x=u_dit[i]
            for j in range(i+1,l):
                y=u_dit[j]
                if dit[x]!=dit[y]:
                    return [x,y]
        return [-1,-1]