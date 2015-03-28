'''Remains to be sovled'''
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    # @param a list of ListNode
    # @return a ListNode
    def mergeKLists(self, lists):
        finalList = []
        listsoffirst = self.listoffirst(lists)
        if listoffirst:
            small = min(listoffirst)
            for i in lists:
                if i.val == small:
                    finalList.append(i.val)
                    i = i.next
            self.mergeKLists(lists)
        return finalList

    def listoffirst(self,lists):
        listoffirst = []
        for i in lists:
            if i:
                listoffirst.append(i[0])
        return listoffirst

    def transfer(self,lists):



