class Solution:
    # @param num, a list of integers
    # @return an integer
    def majorityElement(self, num):
        a =[]
        for i in num:
            if num.count(i) > (len(num)/2):
                a += i
        return a

print Solution().majorityElement(['bj', 'bj', 'bj', 'gz', 'shh', 'shh'])
print Solution().majorityElement(['bj',''])

