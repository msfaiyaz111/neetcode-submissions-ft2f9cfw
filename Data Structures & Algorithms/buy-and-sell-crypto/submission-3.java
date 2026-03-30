class Solution {
    public int maxProfit(int[] prices) {
        int[] profit = new int[prices.length];
        int min = prices[0];
        for(int i=0; i< prices.length; i++){
            profit[i] = Math.max(0, prices[i]-min);
            if(i<prices.length-1 && prices[i] < min){
                min = prices[i];
            }
        }
        int result = 0;
        for(int i=0; i<profit.length; i++){
            result = Math.max(result, profit[i]);
        }
        return result;
    }
}
