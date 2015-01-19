# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class solution:
    # @param p, a tree node
    # @param q, a tree node
    # @return a boolean
    def issametree(self, p, q):
        if p == None and q== None:
            return True
        if p and q and p.val == q.val:
            return self.isSameTree(p.left,q.left) and self.isSameTree(p.right,q.right)
        else:
            return False
        return True

class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

a = TreeNode(1)
b = TreeNode(2)
c = TreeNode(3)

a.left = b
a.right = c

print Solution().isSameTree(a,a)

