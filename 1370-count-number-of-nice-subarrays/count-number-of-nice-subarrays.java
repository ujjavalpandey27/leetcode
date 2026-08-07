class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atmost(nums,k)-atmost(nums,k-1);
    }
    public int atmost(int[] nums,int k){
        int l=0;
        int total=0;
        int count=0;
        for(int r=0;r<nums.length;r++){
            if(!(nums[r]%2==0)){
                count++;
            }
            while(count>k){
                if(!(nums[l]%2==0)){
                count--;
                 
            }
            l++;

            }
            total+=r-l+1;
        }
        return total;
    }
}