class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        INT_MAX = 2**31 - 1
        INT_MIN = -2**31
        sign = -1 if (dividend * divisor) < 0 else 1
        dividend = abs(dividend)
        divisor = abs(divisor)
        total_quotient = 0
        while dividend >= divisor:
            count = 0
            while dividend >= (divisor << (count + 1)):
                count += 1
            total_quotient += 1 << count
            dividend -= divisor << count
        result = sign * total_quotient
        if result < INT_MIN:
            return INT_MIN
        elif result > INT_MAX:
            return INT_MAX
        else:
            return result

