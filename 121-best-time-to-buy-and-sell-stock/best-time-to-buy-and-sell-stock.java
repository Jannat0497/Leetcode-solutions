class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int minPrice=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<n;i++){
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }
            else{
                int diff=prices[i]-minPrice ;
                max=Math.max(max,diff);
            }
        }
        return max;
    }
}