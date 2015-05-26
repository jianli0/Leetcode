class Solution:
    # @param {integer[]} nums
    # @return {boolean}
    def containsDuplicate(self, nums):
        if nums:
            if len(set(nums)) == len(nums):
                return False
            else:
                return True
        return False

a = Solution()
print a.containsDuplicate([1,2,3,4,5])
print a.containsDuplicate([1,1,2,3,4,5])

