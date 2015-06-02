# Definition for a binary tree node.
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution:
    # @param {TreeNode} root
    # @return {integer[][]}
    def zigzagLevelOrder(self, root):
        if root == None:
            return []
        level = 0
        current = [root]
        result = []
        while current:
            level += 1
            nextlevel = []
            levelresult = []
            for i in current:
                if i != None:
                    levelresult.append(i.val)
                    if i.left != None:
                        nextlevel.append(i.left)
                    if i.right != None:
                        nextlevel.append(i.right)
            if level % 2 == 0 :
                result.append(levelresult[::-1])
            else:
                result.append(levelresult)
            current = nextlevel
        return result


if __name__ == "__main__":
    root = TreeNode(3)
    root.left = TreeNode(9)
    root.right = TreeNode(20)
    root.right.left = TreeNode(15)
    root.right.right = TreeNode(7)
    result = Solution().zigzagLevelOrder(root)
    print result


    print Solution().zigzagLevelOrder(None)
