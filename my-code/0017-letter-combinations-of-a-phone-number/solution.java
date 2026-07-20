class Solution {
    public List<String> letterCombinations(String digits) {
        String[] ref={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        
        

        List<String> ans=new ArrayList<>();
        if(digits.length()==0){
            return ans;
        }
        
        StringBuilder mini=new StringBuilder();

        helper(ref,digits,ans,0,mini);
        return ans;
    }
    public void helper(String[] ref,String digits,List<String> ans,int index,StringBuilder mini){
        
        if(index==digits.length()){
            ans.add(mini.toString());
            return;
    }
        int digit=digits.charAt(index)-'0';

        for(int i=0;i<ref[digit].length();i++){
        mini.append(ref[digit].charAt(i));
        helper(ref,digits,ans,index+1,mini);
        mini.deleteCharAt(mini.length()-1);
        }
        
    }
}
