class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hash=new HashMap<>();
        int count=0;
        int presum=0;
        hash.put(0,1);
        for(int i=0;i<nums.length;i++){
            presum+=nums[i];

            

            

            if(hash.containsKey(presum-k)){
                count+=hash.get(presum-k);
            }
            hash.put(presum,hash.getOrDefault(presum,0)+1);
         
        }
        return count;
    }
}
