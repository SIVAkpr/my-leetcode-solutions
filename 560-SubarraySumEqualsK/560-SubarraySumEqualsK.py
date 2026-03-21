# Last updated: 3/21/2026, 3:40:29 PM
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        ans=0
        # for i in range(len(nums)):
        #     c_sum=0
        #     for j in range(i,len(nums)):
        #         c_sum+=n[j]
        #         if c_sum==k:
        #             ans+=1
        # return ans
        c_sum=0
        counts={0:1}
        for i in nums:
            c_sum+=i
            if c_sum-k in counts:
                ans+=counts[c_sum-k]
            counts[c_sum]=counts.get(c_sum,0)+1
        return ans