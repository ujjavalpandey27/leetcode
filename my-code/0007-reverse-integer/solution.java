class Solution {
    public int reverse(int x) {
        int temp = 0;
        
        while (x != 0) {
            int pop = x % 10; 
            x = x / 10;       
            
           
            if (temp > Integer.MAX_VALUE / 10  ) {
                return 0;
            }
            
            
            if (temp < Integer.MIN_VALUE / 10 ) {
                return 0;
            }
            
            
            temp = (temp * 10) + pop;
        }
        
        return temp;
    }
}
