# Last updated: 3/21/2026, 3:40:20 PM
class Solution:
    def threeSumMulti(self, arr: List[int], target: int) -> int:
        l=len(arr)
        t=target
        s=0
        mod=10**9+7
        frequency_map={}
        for i in arr:
            frequency_map[i]=frequency_map.get(i,0)+1
        
        for mid_inx,mid_val in enumerate(arr):
            frequency_map[mid_val]-=1
            for left in range(mid_inx):
                left=arr[left]
                req_val=t-left-arr[mid_inx]
                s=(s+frequency_map.get(req_val,0))%mod
        return s