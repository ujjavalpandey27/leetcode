class Solution {
    public long beautifulSubarrays(int[] nums) {
    HashMap<Integer,Integer> hash=new HashMap<>();

    hash.put(0,1);

    int prexor=0;

    long count=0;

      for(int i=0;i<nums.length;i++){
        prexor^=nums[i];
        if(hash.containsKey(0^prexor)){
            count+=hash.get(0^prexor);
        }
        hash.put(prexor,hash.getOrDefault(prexor,0)+1);

      }
      return count;
    }
}
