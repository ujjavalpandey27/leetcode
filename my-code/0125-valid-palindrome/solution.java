class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
            char x=s.charAt(left);
            char y=s.charAt(right);
            if(!Character.isLetterOrDigit(x)){
                left++;
            }
            else if(!Character.isLetterOrDigit(y)){
                right--;
            }
            else{
                if(Character.toLowerCase(x)==Character.toLowerCase(y)){
                    left++;
                    right--;
                    continue;
                }
                else
                return false;
            }
        }
        return true;
    }
    
}
