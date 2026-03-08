class Solution:
    def findDifferentBinaryString(self, nums: List[str]) -> str:
        i=0
        l=len(nums[0])
        n=set(nums)
        def binn(num,ll):
            ans=""
            while num>0:
                if num%2==0:
                    ans+='0'
                else:
                    ans+='1'
                num=num//2
            if ll>len(ans):
                ap=l-len(ans)
                for i in range(ap):
                    ans+='0'
            # print(ans[::-1])
            return ans[::-1]
        for i in range(len(nums)+1):
            if binn(i,l) not in n:
                return binn(i,l)