class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> mini = new ArrayList<>();
        Arrays.sort(candidates);

        helper(candidates,target,0,0,mini,ans);
        return ans;
    }
    public void helper(int[] nums,int target,int index,int sum,List<Integer> mini,List<List<Integer>> ans){
        
        if(sum==target){
            
            ans.add(new ArrayList<>(mini));
            return;
        }
        if(index==nums.length|| sum>target){
            return;
        }
        for(int i=index;i<nums.length;i++){
        if(i>index && nums[i]==nums[i-1]){
            continue;
        }
        mini.add(nums[i]);
        helper(nums,target,i+1,sum+nums[i],mini,ans);
        mini.remove(mini.size()-1);
      
        }



        
    }
}

