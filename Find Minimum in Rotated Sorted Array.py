class Solution:
    # @param num, a list of integer
    # @return an integer
    def findMin(self, num):
        print "num is %r"%(num) ##########
        if len(num) == 1:
            print "num[0] is %d"%(num[0])
            return num[0]
        else:
            print "start end median"#######
            start = 0
            end = len(num) - 1
            median = end / 2
            print "%r %r %r"%(start,end,median)#######
            if num[median] < num[median-1]:
                return num[median]
            elif num[median] > num[end]:
                a = num[median+1:end+1]
                return self.findMin(a)
            else:
                a = num[start:median]
                return self.findMin(a)

print Solution().findMin([2])
print Solution().findMin([2,1])
#print Solution().findMin([0, 1, 2, 3, 4, 5, 6, 7])
#print Solution().findMin([2, 3, 4, 5, 6, 7, 0, 1])
#print Solution().findMin([3, 4, 5, 6, 7, 0, 1, 2])
#print Solution().findMin([5, 6, 7, 0, 1, 2, 3, 4])


