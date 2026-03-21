class Solution:
    def findMaxK(self, nums: List[int]) -> int:
        q=0
        rst=[]
        a=0
        print(len(nums))
        while(1):
            maxx=nums[q]
            for i in range(q+1,len(nums)):
                if(maxx==(-1*nums[i])):
                    rst.append(maxx)
            a=a+1
            q=q+1
            if(a==len(nums)):
                break
        if(rst):
            for i in range(len(rst)):
                if(rst[i]<0):
                    rst[i]=-1*rst[i]
            return max(rst)
        else:
            return -1

            
