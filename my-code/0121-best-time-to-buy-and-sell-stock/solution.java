class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        
        int ans=0;
        for(int i=0;i<prices.length;i++){
           
                min=Math.min(prices[i],min);
          
                ans=Math.max(ans,prices[i]-min);
            
        }
        return ans;
    }
}
