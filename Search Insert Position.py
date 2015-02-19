class Solution:
    # @param A, a list of integers
    # @param target, an integer to be inserted
    # @return integer
    def searchInsert(self, A, target):
        if target < A[0]:
            return 0
        elif target > A[len(A) - 1]:
            return len(A)
        for i in range(0,len(A)):
            if A[i] == target:
                return i
            elif A[i] < target < A[i+1]:
                return i + 1

print Solution().searchInsert([1,3,5,6], 5)
print Solution().searchInsert([1,3,5,6], 2)
print Solution().searchInsert([1,3,5,6], 7)
print Solution().searchInsert([1,3,5,6], 0)
