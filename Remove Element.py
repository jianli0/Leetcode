class Solution:
    # @param    A       a list of integers
    # @param    elem    an integer, value need to be removed
    # @return an integer
    def removeElement(self, A, elem):
        B = []
        B[:] = A
        for i in range(0,len(B)):
            if B[i] == elem:
                del A[i]
        print A
        return len(A)

print Solution().removeElement([1,2,3,4,5,5,5],5)

