class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> mini=new ArrayList<>();
        
        helper(ans,mini,0,s);
        return ans;
        
    }
    public void helper(List<List<String>> ans,List<String> mini,int index,String s){
        if(index==s.length()){
            ans.add(new ArrayList<>(mini));
            return;
        }
        for(int i=index;i<s.length();i++){
            String current=s.substring(index,i+1);
            if(palindrome(current)){
                mini.add(current);
                helper(ans,mini,i+1,s);
                mini.remove(mini.size()-1);
            }
        }

    }
    public boolean palindrome(String s){
       
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
