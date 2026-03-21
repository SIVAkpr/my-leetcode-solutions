# Last updated: 3/21/2026, 3:40:10 PM
class Solution:
    def maxAbsValExpr(self, arr1: List[int], arr2: List[int]) -> int:
        # rst=0
        # for i in range(len(arr1)):
        #     for j in range(len(arr2)):
        #         a=abs(arr1[i]-arr1[j])+abs(arr2[i]-arr2[j])+arr2(i-j)
        #         rst=max(a,rst)
        # return rst
        n=len(arr1)
        max1=max2=max3=max4=float('-inf')
        min1=min2=min3=min4=float('inf')
        
        for i in range(n):
            v1 = arr1[i]+arr2[i]+i
            v2 = arr1[i]+arr2[i]-i
            v3 = arr1[i]-arr2[i]+i
            v4 = arr1[i]-arr2[i]-i
            
            max1 = max(max1, v1)
            min1 = min(min1, v1)
            
            max2 = max(max2, v2)
            min2 = min(min2, v2)
            
            max3 = max(max3, v3)
            min3 = min(min3, v3)
            
            max4 = max(max4, v4)
            min4 = min(min4, v4)
        return max( max1 - min1,
            max2 - min2,
            max3 - min3,
            max4 - min4
        )