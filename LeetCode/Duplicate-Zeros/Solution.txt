1class Solution:
2    def duplicateZeros(self, arr: List[int]) -> None:
3        """
4        Do not return anything, modify arr in-place instead.
5        """
6        lst=[]
7        for indx,value in enumerate(arr):
8            if value==0:
9                lst.append(indx)
10        for i in lst[::-1]:
11            arr.insert(i,0)
12            arr.pop()