class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        int i=0;
       while(i<nums.length-count){
        if(nums[i]==val){
            int temp=nums[i];
            nums[i]=nums[nums.length-1-count];
            nums[nums.length-1-count]=temp;
            count++;
            continue;
        }
        i++;
       } 
       return nums.length-count;
    }
}