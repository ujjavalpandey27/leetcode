class Solution {
    public int addDigits(int num) {

        if(num/10 == 0){
            return num;
        }
        if ((num%10+addDigits(num/10))/10 != 0){
            return ((num%10+addDigits(num/10))%10 +addDigits((num%10+addDigits(num/10))/10));
         };
        
        return (num%10+addDigits(num/10));


    }
}    

