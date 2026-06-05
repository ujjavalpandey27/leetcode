class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> temp=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[Math.abs(nums[i])-1]>0)
            nums[Math.abs(nums[i])-1]*=-1;
            else continue;
        }
        for(int i = 0; i <nums.length;i++){
            if(nums[i]>0){
                temp.add(i+1);
            }
    }
        return temp;
}}
