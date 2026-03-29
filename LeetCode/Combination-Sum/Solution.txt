1class Solution:
2    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
3        def backtrack(start, path, remaining):
4            if remaining == 0:
5                result.append(path.copy())
6                return
7            if remaining < 0:
8                return
9            
10            for i in range(start, len(candidates)):
11                path.append(candidates[i])
12                backtrack(i, path, remaining - candidates[i])
13                path.pop()
14        
15        result = []
16        backtrack(0, [], target)
17        return result