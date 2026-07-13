class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();

        helper(0,0,"",ans,n);
        return ans;
    }
    public void helper(int open,int close,String string,List<String>ans,int n){
        if(open+close==2*n){
            ans.add(string);
            return;
        }
        if(open<n){
            helper(open+1,close,string+'(',ans,n);
        }
        if(close<open){
            helper(open,close+1,string+')',ans,n);
        }
        return;
    }
}
