# Last updated: 3/21/2026, 3:40:12 PM
class Solution:
    def duplicateZeros(self, arr: List[int]) -> None:
        """
        Do not return anything, modify arr in-place instead.
        """
        lst=[]
        for indx,value in enumerate(arr):
            if value==0:
                lst.append(indx)
        for i in lst[::-1]:
            arr.insert(i,0)
            arr.pop()