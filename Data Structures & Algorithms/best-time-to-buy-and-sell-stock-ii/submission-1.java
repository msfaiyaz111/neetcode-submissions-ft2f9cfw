class Solution {
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];
        for(int i=0; i<prices.length; i++){
            dp[i][0] = -1;
            dp[i][1] = -1;
        }
        return rec(prices, 0, 0, dp);
    }
    

    public int rec(int[] prices, int day, int bought, int[][] dp){
        if(day == prices.length){
            return 0;
        }
        if(dp[day][bought] != -1){
            return dp[day][bought];
        }
        int res = rec(prices, day+1, bought, dp);
        if(bought ==0){
            res = Math.max(res, -prices[day] + rec(prices, day+1, 1, dp));
        }else{
            res = Math.max(res, prices[day]+ rec(prices, day+1, 0, dp));
        }
        dp[day][bought] = res;
        return res;

    }
}