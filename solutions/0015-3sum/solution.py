class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        n=nums
        res=[]
        n.sort()
        l=len(n)
        for i in range(l-2):
            if i>0 and n[i]==n[i-1]:
                continue
            left=i+1
            right=l-1
            while left<right:
                s=n[i]+n[left]+n[right]
                if s==0:
                    res.append([n[i],n[left],n[right]])
                    while left<right and n[left]==n[left+1]:
                        left=left+1
                    while left<right and n[right]==n[right-1]:
                        right-=1
                    left+=1
                    right-=1
                elif s<0:
                    left+=1
                else:
                    right-=1
        return res
