class Solution:
    def countOdds(self, low: int, high: int) -> int:
        l=low
        h=high
        if(l%10)%2==0 and (h%10)%2==0:
            return (h-l)//2
        elif (l%10)%2!=0 and (h%10)%2==0:
            l=l-1
            return (h-l)//2
        elif (l%10)%2==0 and (h%10)%2!=0:
            h=h+1
            return (h-l)//2
        else:
            l=l-1
            h=h+1
            return (h-l)//2
