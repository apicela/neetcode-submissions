class Solution {
    public int maxProfit(int[] prices) {
        int max = 0, buyedBy = 999, greather = 0;
        for(int i = 0;i < prices.length; i++) {
            if(prices[i] < buyedBy){
                buyedBy = prices[i];
                greather = 0;
            }
            else if(greather < prices[i]) greather = prices[i];
            max = Math.max(max, (greather - buyedBy))     ;      
        }
        return max;
    }
}
