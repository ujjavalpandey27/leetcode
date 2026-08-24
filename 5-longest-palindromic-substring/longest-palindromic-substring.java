class Solution {
    public String longestPalindrome(String s) {
        int start=0;
        int end=0;
        for(int i=0;i<s.length();i++){
            int len1=helper(i,i,s);
            int len2=helper(i,i+1,s);
            int curmax=Math.max(len1,len2);
            if(curmax>end-start+1){
            if(len1>len2){
                start=i-len1/2;
                end=i+len1/2;
            }
            if(len2>len1){
                start=i+1-(len2/2);
                end=i+(len2/2);
            }
            }
        }
        return s.substring(start,end+1);
        
    }
    public int helper(int left,int right,String s){
        int len=0;
        while(left>=0 && right<=s.length()-1 && s.charAt(left)==s.charAt(right)){
            len=right-left+1;
            left--;
            right++;
        }
        return len;
    }
}