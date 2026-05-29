class Solution {
    public boolean isPalindrome(int x) {
        
    
        int temp = 0;
        int temp2=x;
        
        while (x != 0) {
            int pop = x % 10; 
            x = x / 10;
           
            temp = (temp * 10) + pop;
        }
       if(temp<0){
        return false;
       }
        else if(temp==temp2)
        return true;
        return false;
    }
}
   

