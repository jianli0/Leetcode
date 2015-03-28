# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    # @param two ListNodes
    # @return a ListNode
    def mergeTwoLists(self, l1, l2):
        node = guard_node = ListNode(0)

        while l1 and l2:
            print "(l1 -> %d, l2 -> %d)"%(l1.val,l2.val)
            if l1.val < l2.val:
                node.next = l1
                l1 = l1.next
                node = node.next
            elif l1.val > l2.val:
                node.next = l2
                l2 = l2.next
                node = node.next
            elif l1.val == l2.val:
                node.next = l1
                l1 = l1.next
                node = node.next
                node.next = l2
                l2 = l2.next
                node = node.next

        if l1 or l2:
            node.next = l1 or l2
        return guard_node.next

#    for test
    def printListNodes(self,node):
        if not node == None:
            print node.val,
            self.printListNodes(node.next)

# class MakeListNode:
    # def __init__(self,ListofNodes):
        # self.ListNodes = ListofNodes

    # def makeListNodes(self):

        # for i in self.ListNodes:




l11 = ListNode(-9)
l12 = ListNode(-7)
l13 = ListNode(-3)
l14 = ListNode(-3)
l15 = ListNode(-1)
l16 = ListNode(2)
l17 = ListNode(3)

l11.next = l12
l12.next = l13
l13.next = l14
l14.next = l15
l15.next = l16
l16.next = l17

l21 = ListNode(-7)
l22 = ListNode(-7)
l23 = ListNode(-6)
l24 = ListNode(-6)
l25 = ListNode(-5)
l26 = ListNode(-3)
l27 = ListNode(2)
l28 = ListNode(4)

l21.next = l22
l22.next = l23
l23.next = l24
l24.next = l25
l25.next = l26
l26.next = l27
l27.next = l28


a = Solution()
a.printListNodes(a.mergeTwoLists(l11,l21))


