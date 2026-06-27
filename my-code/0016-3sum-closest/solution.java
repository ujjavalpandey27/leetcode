class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        
       
        
        
        int closestsum=nums[0]+nums[1]+nums[2];
        
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            int k=nums.length-1;
            
            
            while(j<k){
                int cursum=nums[i]+nums[j]+nums[k];
                if(Math.abs(target-cursum)<Math.abs(target-closestsum)){
                    closestsum=cursum;
                }
                if(cursum>target){
                    k--;
                }
                else if(cursum<target){
                    j++;
                }
                else{
                    return cursum;
                }
            }
        }
        return closestsum;
    }
}
