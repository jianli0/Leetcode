# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    # @param {TreeNode} root
    # @return {integer[][]}
    def levelOrderBottom(self, root):
        if root == None:
            return []
        current = [root]
        result = []
        while current:
            #print "hello"
            nextlevel = []
            levelresult = []
            for i in current:
                if i != None:
                    levelresult.append(i.val)
                    if i.left != None:
                        nextlevel.append(i.left)
                    if i.right != None:
                        nextlevel.append(i.right)
            result.append(levelresult)
            current = nextlevel
        return result[::-1]

