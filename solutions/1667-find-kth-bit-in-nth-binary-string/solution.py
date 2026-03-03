class Solution:
    def findKthBit(self, n: int, k: int) -> str:
        def reverse_invert(a):
            ans=a[::-1]
            ans2="".join(["1" if char == "0" else "0" for char in a])
            return ans2[::-1]
        dit={1:"0"}
        for i in range(2,n+1):
            s_n=dit[i-1] + "1" + reverse_invert(dit[i-1])
            dit[i]=s_n
        return dit[n][k-1]
