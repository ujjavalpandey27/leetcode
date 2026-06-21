class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        int[] dummy=nums.clone();
        Arrays.sort(dummy);
        int start=0;
        int end=nums.length-1;
        while(start<end){
            if(dummy[start]+dummy[end]>target){
                end--;
            }
            else if(dummy[start]+dummy[end]<target){
                start++;
            }
            else{
               
                break;
            }
        }
        int val=start;
        int val1=end;
        start=-1;
        end=-1;
        for(int i=0;i<nums.length;i++){
            if(start==-1 && dummy[val]==nums[i]){
                start=i;
            
            }
            else if(end==-1 && dummy[val1]==nums[i]){
                end=i;
            
            }
        }
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
}
