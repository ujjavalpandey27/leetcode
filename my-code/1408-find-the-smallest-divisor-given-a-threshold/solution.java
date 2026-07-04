class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
       int high=Integer.MIN_VALUE;
       for(var i :nums){
        if(i>high){
            high=i;
        }
       }
       
       int ans=Integer.MAX_VALUE;
       while(low<=high){
        int mid=low+(high-low)/2;
        int result=helper(nums,mid,threshold);
        if(result==0){
            low=mid+1;
        }
        else{
            ans=Math.min(mid,ans);
            high=mid-1;
        }
       }
    return ans;
    }
    public int helper(int[] nums,int mid,int threshold){
        long sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=((nums[i]+mid-1)/mid);
            if(sum>threshold){
                return 0;
            }
        }
        
            return 1;
        

    }
}
