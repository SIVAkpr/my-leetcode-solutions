class Solution:
    def calculate(self, s: str) -> int:
        stack=[]
        prev_op='+'
        cur_no=0
        l=len(s)
        for idx,ch in enumerate(s):
            if ch.isdigit():
                cur_no=cur_no*10+int(ch)
            if idx==l-1 or ch in "+-*/":
                if prev_op=='+':
                    stack.append(cur_no)
                elif prev_op=='-':
                    stack.append(-cur_no)
                elif prev_op=='*':
                    stack.append(stack.pop()*cur_no)
                elif prev_op=='/':
                    stack.append(int(stack.pop()/cur_no))
                prev_op=ch
                cur_no=0
        return sum(stack)