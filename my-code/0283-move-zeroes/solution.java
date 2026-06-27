class Solution {
    public void moveZeroes(int[] nums) {
        int holder=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[holder];
                nums[holder]=nums[i];
                nums[i]=temp;
                holder++;
            }
        }
    }
}
