class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> mini = new ArrayList<>();

        helper(candidates,target,0,0,mini,ans);
        return ans;
    }
    public void helper(int[] nums,int target,int index,int sum,List<Integer> mini,List<List<Integer>> ans){
        
        if(sum==target ){
            ans.add(new ArrayList<>(mini));
            return;
        }
        if(index==nums.length|| sum>target){
            return;
        }

        mini.add(nums[index]);
        helper(nums,target,index,sum+nums[index],mini,ans);
        mini.remove(mini.size()-1);
        helper(nums,target,index+1,sum,mini,ans);
    }
}
