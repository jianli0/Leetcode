'''Given an array of integers, every
element appears twice except for one. Find that single one.'''

class Solution:
    # @param A, a list of integer
    # @return an integer
    def singleNumber(self, A):
        result = A[0]
        A.remove(result)
        for i in A:
            result ^= i
        return result

print Solution().singleNumber([1,2,2,3,3])

