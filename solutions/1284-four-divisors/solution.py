class Solution:
    def sumFourDivisors(self, nums: List[int]) -> int:
        n=nums
        fin=0
        for i in n:
            div=set()
            for j in range(1,int(sqrt(i) + 1)):
                if i%j==0:
                    div.add(j)
                    div.add(i//j)
                if len(div)>4:
                    break
            if len(div)==4:
                fin+=sum(div)
        return fin
