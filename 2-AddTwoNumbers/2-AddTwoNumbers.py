# Last updated: 3/21/2026, 3:41:35 PM
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        cy=0
        dum=ListNode(0)
        curr=dum
        while l1 or l2 or cy:
            a=l1.val if l1 else 0
            b=l2.val if l2 else 0
            res=a+b+cy
            cy=res//10
            curr.next=ListNode(res%10)
            curr=curr.next
            if l1:
                l1=l1.next
            if l2:
                l2=l2.next
        return dum.next