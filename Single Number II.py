class Solution:
    # @param A, a list of integer
    # @return an integer
    def singleNumber(self, A):
        B = A[:]
        result = A[0]
        A.remove(result)
        for i in A:
            result ^= i
        for i in B:
            result ^= i

print Solution().singleNumber()
