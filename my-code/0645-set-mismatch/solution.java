class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        
        int[] temp = new int[n + 1]; 
        int missing = 0;
        int duplicate = 0;
        
       
        for(int i = 0; i < n; i++){
            temp[nums[i]]++;
        }
        
        
        for(int i = 1; i <= n; i++){
            if(temp[i] == 2){
                duplicate = i;
            }
            if(temp[i] == 0){
                missing = i;
            }
        }
        
        int[] arr = new int[2];
        arr[0] = duplicate; 
        arr[1] = missing;
        return arr;
    }
}
