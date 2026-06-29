class Solution {
    public boolean isPerfectSquare(int num) {
        if(Math.sqrt(num)-(int)Math.sqrt(num)==0){
            return true;
        }
         return false;
    }
}
