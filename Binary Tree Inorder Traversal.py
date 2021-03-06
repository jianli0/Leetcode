# Definition for a binary tree node.
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution:
    # @param {TreeNode} root
    # @return {integer[]}
    def inorderTraversal(self, root):
        if root == None:
            return []

        path = []
        stack = []
        while stack or root is not None:
            if root is not None:
                stack.append(root)
                root = root.left
            else:
                root = stack.pop()
                path.append(root.val)
                root = root.right
        return path



# Test
a = TreeNode("a")
b = TreeNode("b")
c = TreeNode("c")
d = TreeNode("d")
e = TreeNode("e")
f = TreeNode("f")
g = TreeNode("g")
h = TreeNode("h")

a.left = b
a.right = g
b.right = c
g.left = h
c.left = d
d.left = e
d.right = f

print Solution().inorderTraversal(a)
