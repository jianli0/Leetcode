class Solution:
    # @param s, a string
    # @return an integer
    def titleToNumber(self, s):
        sum = 0
        for i in range(0,len(s)):
            sum += (ord(s[-(i+1)]) - 64) * 26**i
        return sum
