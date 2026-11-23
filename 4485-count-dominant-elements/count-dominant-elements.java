class Solution {
    public int countDominantElements(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        int count=0;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]>=(nums[i+1]+nums[i-1])/2.0){
                count++;
            }
        }

        if(nums[0]>=nums[1])
        count++;
        if(nums[nums.length-1]>=nums[nums.length-2])
        count++;
        return count;
    }
}