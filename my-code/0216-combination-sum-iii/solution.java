class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> mini=new ArrayList<>();
        helper(ans,mini,k,n,1,0);
        return ans;

    }
    public void helper(List<List<Integer>>ans,List<Integer>mini,int k, int n,int num,int sum){
        if(sum==n && mini.size() == k){
            ans.add(new ArrayList<>(mini));
            return;
        }
        
        if(sum > n || mini.size() >= k){
        return;
    }

        for(int i=num;i<10;i++){
        mini.add(i);
        helper(ans,mini,k,n,i+1,sum+i);
        mini.remove(mini.size()-1);
        }


    }
}
