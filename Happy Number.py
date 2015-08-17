class Solution:
    # @param {integer} n
    # @return {boolean}
    def isHappy(self, n):
        circle = set()
        while n != 1:
            n = sum([int(i) ** 2 for i in str(n)])
            if n in circle:
                return False
            else:
                circle.add(n)

        return True


if Solution().isHappy(19):
    print "Right"
else:
    print "Wrong"

