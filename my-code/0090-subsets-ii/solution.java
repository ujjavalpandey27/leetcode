class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> mini=new ArrayList<>();
        Arrays.sort(nums);
        helper(ans,mini,0,nums);
        return ans;

    }
    public void helper(List<List<Integer>>ans,List<Integer>mini,int index,int[] nums){  
        ans.add(new ArrayList<>(mini));
        for(int i=index;i<nums.length;i++){
            if(i!=index && nums[i]==nums[i-1]){
                continue;
            }
            mini.add(nums[i]);
            helper(ans,mini,i+1,nums);
            mini.remove(mini.size()-1);
            

        }

     

    }

}
