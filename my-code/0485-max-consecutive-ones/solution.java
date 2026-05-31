class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int prevcount=0;
        int maxcount=0;
        int curcount=0;
        for(var i:nums){
            if(i==1){
                curcount++;
                if(curcount>maxcount){
                    maxcount=curcount;
                }
            }
            else{
                
                curcount=0;
                

            }
        }
        return maxcount;
    }
}
