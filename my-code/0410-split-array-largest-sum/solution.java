class Solution {
    public int splitArray(int[] nums, int k) {

        int low=Integer.MIN_VALUE;
        for(int i:nums){
            if(i>low){
                low=i;
            }
        }
        int high=0;
        for(var i:nums){
            high+=i;
        }
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            int result = helper(nums,mid,k);
            if(result==1){
                ans=mid;
                high=mid-1;
                
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int helper(int[] nums,int mid,int k){
        int sum=0;
        int count=1;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>mid){
                sum=nums[i];
                count++;
            }
        }
        if(count<=k){
            return 1;
        }
        else 
        return 0;
    }
}
