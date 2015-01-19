class TreeNode:
    def __init__(self,x):
        self.val = x
        self.left = None
        self.right = None

a = TreeNode(1)
b = TreeNode(2)
c = TreeNode(3)
a.left = b
a.right = c

print a.val
print a.left.val
print a.right.val
print a 
