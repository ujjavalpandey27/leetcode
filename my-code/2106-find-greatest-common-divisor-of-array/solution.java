class Solution {
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(var i:nums){
            if(i<min){
                min=i;
            }
            if(i>max){
                max=i;
            }
        }
        
        while(min!=0){
            int temp=min;
            min=max%min;
            max=temp;
        }
        return max;
    }
}
