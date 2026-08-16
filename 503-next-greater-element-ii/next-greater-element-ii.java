class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[nums.length];
        Arrays.fill(ans,-1);
        for(int i=(2*nums.length-1);i>=0;i--){
            int num=i%nums.length;
            while(st.size()>0 && st.peek()<=nums[num]){
                st.pop();
            }
            if(st.size()>0 && ans[num]==-1 && st.peek()>nums[num]){
                ans[num]=st.peek();
            }
            st.push(nums[num]);


        }
        return ans;
    }
}