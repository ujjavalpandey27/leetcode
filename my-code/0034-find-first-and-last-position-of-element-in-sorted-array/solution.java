class Solution {
    public int[] searchRange(int[] nums, int target) {
    return new int[]{first(nums,target),second(nums,target)};
    }
   
    public int first(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        int first=-1;
        while(low<=high){
        int mid=low+(high-low)/2;
        if(nums[mid]==target){
            first=mid;
            high=mid-1;
        }
        else if(nums[mid]>target){
            high=mid-1;

        }
        else{
            low=mid+1;
        }
        }
        return first;
    }
    public int second(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        int second=-1;
        while(low<=high){
        int mid=low+(high-low)/2;
        if(nums[mid]==target){
            second=mid;
            low=mid+1;
        }
        else if(nums[mid]>target){
            high=mid-1;

        }
        else{
            low=mid+1;
        }
        }
        return second;
    }
}
