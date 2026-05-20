class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==1)return 0;
        int minPrize=prices[0];
        int max=Integer.MIN_VALUE;
        for(int i=1;i<prices.length;i++){
            minPrize=Math.min(prices[i],minPrize);
            max=Math.max(prices[i]-minPrize,max);
        }
        return max;
    }
}