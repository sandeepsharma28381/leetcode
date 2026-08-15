class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        min = prices[0]
        max = 0

        for n in prices:
            if n < min:
                min = n

            pro = n - min

            if pro > max:
                max = pro
        return max