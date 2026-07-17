class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int candidate1=0;
        int candidate2=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==candidate1 && count1>0){
                count1++;
            }
            else if(nums[i]==candidate2 && count2>0){
                count2++;
            }
            else if(count1==0){
                candidate1=nums[i];
                count1++;
            }
            else if(count2==0){
                candidate2=nums[i];
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
      
       
        count1=0;
        count2=0;
        List<Integer> result=new ArrayList<>();
       int k=nums.length/3;
       for(var i:nums){
        if(i==candidate1){
            count1++;

        }
        else if(i==candidate2){
            count2++;
        }}

        if(count1>k)
        result.add(candidate1);
        if(count2>k)
        result.add(candidate2);
        return result;
    }
}
