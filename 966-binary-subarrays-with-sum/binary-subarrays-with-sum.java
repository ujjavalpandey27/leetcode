class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atmost(nums,goal)-atmost(nums,goal-1);
    }
    public int atmost(int[]nums,int goal){
        if(goal<0){
            return 0;
        }
        int count=0;
        int l=0;
        int r=0;
        int cur=0;
        
        while(r<nums.length){
            cur+=nums[r];

            while(cur>goal){
                cur-=nums[l];
                l++;
            }
            count+=(r-l+1);
            r++;
        }
        return count;
    }
}