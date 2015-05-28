# Definition for a binary tree node.
# postorder is the reverse order of preorder except that
# in this preorder we need to visit the right node first
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution:
    # @param {TreeNode} root
    # @return {integer[]}
    def postorderTraversal(self, root):
        path = []
        stack = []
        stack.append(root)
        while stack:
            present = stack.pop()
            if not present == None:
                path.append(present.val)
                stack.append(present.left)
                stack.append(present.right)
        return path[::-1]


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

print Solution().postorderTraversal(a)

