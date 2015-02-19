class Solution:
    # @param num, a list of integer
    # @return an integer
    def findMin(self, num):
        print "num is %r"%(num) ##########
        if num:
            if len(num) == 1:
                return num[0]
            else:
                start = 0
                end = len(num) - 1
                median = end / 2
                print "start end median"#######
                print "%r %r %r"%(start,end,median)#######
                if num[median] < num[median-1]:
                    return num[median]
                elif num[median] > num[end]:
                    self.findMin(num[median+1:end+1])
                else:
                    self.findMin(num[start:median])

print Solution().findMin([0, 1, 2, 3, 4, 5, 6, 7])
print Solution().findMin([2, 3, 4, 5, 6, 7, 0, 1])
print Solution().findMin([3, 4, 5, 6, 7, 0, 1, 2])
print Solution().findMin([5, 6, 7, 0, 1, 2, 3, 4])


