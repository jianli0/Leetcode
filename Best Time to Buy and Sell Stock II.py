class Solution:
    # @param prices, a list of integer
    # @return an integer
    def maxProfit(self, prices):
        profit = 0
        for i in range(0,len(prices) - 1):
            print prices[0],prices[1]
            if prices[i+1] > prices[i]:
                profit += prices[i+1] - prices[i]
        return profit

print Solution().maxProfit([1,2])

