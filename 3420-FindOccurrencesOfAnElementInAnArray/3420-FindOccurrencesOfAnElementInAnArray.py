# Last updated: 3/21/2026, 3:39:18 PM
class Solution:
    def occurrencesOfElement(self, nums: List[int], queries: List[int], x: int) -> List[int]:
        index=[]
        q=queries
        n=nums
        ans=[]
        for i,num in enumerate(n):
            if num==x:
                index.append(i)
        print(index)
        for query in q:
            if query <=len(index):
                ans.append(index[query-1])
            else:
                ans.append(-1)
        return ans
