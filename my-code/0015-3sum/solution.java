class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }
            while(j<k){
                if(nums[i]+nums[j]+nums[k]>0){
                    k--;
                }
                else if(nums[i]+nums[j]+nums[k]<0){
                    j++;
                }
                else{
                    List<Integer> mini=Arrays.asList(nums[i],nums[j],nums[k]);
                    
                    ans.add(mini);
                    j++;
                    k--;
                    while(j<k && j!=i+1 && nums[j-1]==nums[j] ){
                        j++;
                    }
                    while(j<k && k!=nums.length-1 && nums[k]==nums[k+1]){
                        k--;
                    }


                }
            }
        }
        return ans;
    }
}
