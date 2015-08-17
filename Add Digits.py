# Solution 1
class Solution:
    # @param {integer} num
    # @return {integer}
    def addDigits(self, num):
        if num < 10:
            return num
        res = num % 10
        while num/10 > 0:
            num = num/10
            res += num % 10

        return self.addDigits(res)

# Solution 2
# class Solution:
    # # @param {integer} num
    # # @return {integer}
    # def addDigits(self, num):
        # if num % 9 :
            # return num % 9
        # elif num:
            # return 9
        # else:
            # return 0

print Solution().addDigits(38)
