1class node:
2    def __init__(self,data):
3        self.data=data
4        self.next=None
5class MyLinkedList:
6
7    def __init__(self):
8        self.head=None
9        self.tail=None
10
11    def get(self, index: int) -> int:
12        if index<0 or self.head is None: return -1
13        curr=self.head
14        for i in range(index):
15            curr=curr.next
16            if curr is None:
17                return -1
18        return curr.data
19
20    def addAtHead(self, val: int) -> None:
21        newnode=node(val)
22        if self.head:
23            newnode.next=self.head
24            self.head=newnode
25        else:
26            self.head=newnode
27            self.tail=newnode
28    def addAtTail(self, val: int) -> None:
29        newnode=node(val)
30        if self.tail:
31            self.tail.next=newnode
32            self.tail=newnode
33        else:
34            self.head=newnode
35            self.tail=newnode
36        return
37
38    def addAtIndex(self, index: int, val: int) -> None:
39        if index==0:
40            self.addAtHead(val)
41            return
42        newnode=node(val)
43        curr=self.head
44        for i in range(index-1):
45            if curr==None: break
46            curr=curr.next
47        if curr==None:
48            return
49        newnode.next=curr.next
50        curr.next=newnode
51        if newnode.next==None:
52            self.tail=newnode
53        return
54
55    def deleteAtIndex(self, index: int) -> None:
56        if index<0 or self.head is None: return
57        if index==0:
58            temp=self.head
59            self.head=temp.next
60            if self.head is None: 
61                self.tail=None
62            # temp=None
63            return
64        curr=self.head
65        for i in range(index-1):
66            if curr.next is None: return
67            curr=curr.next
68        temp=curr.next
69        if temp is None:
70            return
71        curr.next=temp.next
72        if curr.next is None:
73            self.tail=curr
74        return
75
76
77# Your MyLinkedList object will be instantiated and called as such:
78# obj = MyLinkedList()
79# param_1 = obj.get(index)
80# obj.addAtHead(val)
81# obj.addAtTail(val)
82# obj.addAtIndex(index,val)
83# obj.deleteAtIndex(index)