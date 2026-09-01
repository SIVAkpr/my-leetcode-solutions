class Solution:
    def mergeCharacters(self, s: str, k: int) -> str:
        res=[]
        seen={}
        for i in s:
            if i in seen and (len(res)-seen[i]) <=k:
                continue
            seen[i]=len(res)
            res.append(i)
        return "".join(res)