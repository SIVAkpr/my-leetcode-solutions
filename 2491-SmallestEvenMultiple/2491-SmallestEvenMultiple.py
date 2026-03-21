# Last updated: 3/21/2026, 3:39:30 PM
class Solution:
    def smallestEvenMultiple(self, n: int) -> int:
        for i in range(1,(n*2)+1):
            if i%2==0 and i%n==0:
                return i