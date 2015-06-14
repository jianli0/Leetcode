class Solution:
    # @param {integer} n
    # @return {integer}
    def numTrees(self, n):
        count = [1,1]
        for i in range(2,n+1):
            result = 0
            for j in range(0,i):
                result += count[j]*count[i-j-1]
            count.append(result)
        return count[n]


#Test
print Solution().numTrees(3)
print Solution().numTrees(4)
