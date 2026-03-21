# Last updated: 3/21/2026, 3:41:21 PM
class Solution:
    def isValid(self, s: str) -> bool:
        stack=[]
        for i in s:
            if i in "({[":
                stack.append(i)
            else:
                if not stack:
                    return False
                top=stack.pop()
                if i==')' and top!='(':
                    return False
                elif i=='}' and top!='{':
                    return False
                elif i==']' and top!='[':
                    return False
        return not stack