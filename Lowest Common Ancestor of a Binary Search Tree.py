# Definition for a binary tree node.
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution:
    # @param {TreeNode} root
    # @param {TreeNode} p
    # @param {TreeNode} q
    # @return {TreeNode}
    def lowestCommonAncestor(self, root, p, q):
        if (p.val - root.val)*(q.val - root.val) <= 0:
            return root
        elif p.val > root.val and q.val > root.val:
            return self.lowestCommonAncestor(root.right,p,q)
        else:
            return self.lowestCommonAncestor(root.left,p,q)


# Test
a1 = TreeNode(8)
a2 = TreeNode(3)
a3 = TreeNode(10)
a4 = TreeNode(1)
a5 = TreeNode(6)
a6 = TreeNode(14)

a1.left = a2
a1.right = a3
a2.left = a4
a2.right = a5
a3.left = a6


print Solution().lowestCommonAncestor(a1,a5,a6).val
print Solution().lowestCommonAncestor(a1,a2,a4).val

