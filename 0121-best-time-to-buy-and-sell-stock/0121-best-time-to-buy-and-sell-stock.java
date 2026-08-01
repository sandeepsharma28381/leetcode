class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;

        for(int price: prices){
            if (price < min){
                min = price;
            }

            int pro = price - min;

            if (pro > max){
                max = pro;
            }
        }
        return max;
    }
}