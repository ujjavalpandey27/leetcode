class Solution {
    public void nextPermutation(int[] nums) {
        int bp=-1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i-1]<nums[i]){
                bp=i-1;
                break;
            }
          
        }
        if(bp==-1){
        for(int i=0;i<nums.length/2;i++){
            int temp=nums[i];
            nums[i]=nums[nums.length-1-i];
            nums[nums.length-1-i]=temp;
            
        }
        return;
    }
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[bp]){
                int temp=nums[i];
                nums[i]=nums[bp];
                nums[bp]=temp;
                break;
            }
        }
        int start=bp+1;
        int end=nums.length-1;
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
  
        

    }
}
