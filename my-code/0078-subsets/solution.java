class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> mini = new ArrayList<>();

        helper(0,nums,mini,ans);
        return ans;

    }
    public void helper(int index,int[] nums,List<Integer>mini,List<List<Integer>>ans){
        if(index==nums.length){
            ans.add(new ArrayList<>(mini));
            return;
        }
        mini.add(nums[index]);
        helper(index+1,nums,mini,ans);
        mini.remove(mini.size()-1);
        helper(index+1,nums,mini,ans);
    }
}
