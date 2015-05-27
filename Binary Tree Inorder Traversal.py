# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    # @param {TreeNode} root
    # @return {integer[]}
    def inorderTraversal(self, root):
        if root == None:
            return []

        result = []
        stack = []
        stack.append(root)
        while stack:
            while root.left == None:
                stack.append(root.left)
                root = root.left

            if root.left == None:
                root = root.right
            el


