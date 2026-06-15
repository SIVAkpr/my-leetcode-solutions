1class Solution:
2    def numberOfEmployeesWhoMetTarget(self, hours: List[int], target: int) -> int:
3        a=list(filter(lambda a: a>=target,hours))
4        return len(a)