class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int l=k-1;
        int r=cardPoints.length-1;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=cardPoints[i];
        }
        int max=sum;
        for(int i=0;i<k;i++){
            sum-=cardPoints[l];
            l--;
            sum+=cardPoints[r];
            r--;


            max=Math.max(max,sum);

        }
        
    
        return max;
    }
}