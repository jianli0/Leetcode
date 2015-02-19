class Solution:
    # @param prices, a list of integer
    # @return an integer
    def maxProfit(self, prices):
        if not prices:
            return 0
        else:
            temp_big = prices[len(prices) - 1]
            temp_profit = 0
            for i in range(-1,-len(prices)-1,-1):
                temp_big = max(temp_big,prices[i])
                if (temp_big - prices[i]) > temp_profit:
                    temp_profit = (temp_big - prices[i])
        return temp_profit

print Solution().maxProfit([1,2,3,4,5,4,3])
print Solution().maxProfit([1,2,3,4,5,4,3])
print Solution().maxProfit([1,2,3,4,5,4,3])
print Solution().maxProfit([1,2,3,4,5,4,3])


