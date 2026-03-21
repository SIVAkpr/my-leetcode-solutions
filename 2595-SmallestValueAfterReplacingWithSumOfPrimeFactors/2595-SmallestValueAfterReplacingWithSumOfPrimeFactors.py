# Last updated: 3/21/2026, 3:39:24 PM
class Solution:
    def smallestValue(self, n: int) -> int:
        def getPrimeSum(num):
            i = 2
            s = 0
            d = num
            while i * i <= d:
                while d % i == 0:
                    s += i
                    d //= i
                i += 1
            if d > 1:
                print(d)
                s += d
            return s
            
        while True:
            next_n = getPrimeSum(n)
            if next_n == n:
                break
            n = next_n
        return n