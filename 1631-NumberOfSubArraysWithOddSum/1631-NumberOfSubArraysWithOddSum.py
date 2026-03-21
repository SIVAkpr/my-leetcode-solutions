# Last updated: 3/21/2026, 3:39:54 PM
class Solution:
    def numOfSubarrays(self, arr: List[int]) -> int:
        cunt=0
        MOD = 10**9 + 7
        even=1
        odd=0
        c_sum=0
        for i in range(len(arr)):
            c_sum += arr[i]
            if c_sum % 2 != 0:
                cunt=(cunt+even)%MOD
                odd+=1
            else:
                cunt=(cunt+odd)%MOD
                even+=1
                
        return cunt
        # for i in range(len(arr)):
        #     c_sum=0
        #     for j in range(i,len(arr)):
        #         c_sum+=arr[j]
        #         if c_sum%2!=0:
        #             cunt =cunt+1
        # return cunt
        # ans=list(filter(lambda x:x%2!=0, rst))
        # return len(ans) % (10**9 + 7)