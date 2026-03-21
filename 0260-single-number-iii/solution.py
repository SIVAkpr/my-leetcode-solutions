class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        dic={}
        for i in nums:
            if i not in dic:
                dic[i]=1
            else:
                dic[i]+=1
        l=[]
        v=0
        for i in dic:
            if dic[i]==1:
                l.append(i)
                v+=1
            if v==2:
                return l


