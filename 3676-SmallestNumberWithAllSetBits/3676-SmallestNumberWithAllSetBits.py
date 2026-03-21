# Last updated: 3/21/2026, 3:39:11 PM
class Solution:
    def smallestNumber(self, n: int) -> int:
        lst=[]
        while(n!=0):
            a=n%2
            lst.append(str(a))
            n=n//2
        lst0=lst[::-1]
        
        for i in range(len(lst)):
            if lst0[i]=="0":
                lst0[i]="1"
        lst1=lst0
        lst2="".join(lst1)
        return int(lst2, 2)
