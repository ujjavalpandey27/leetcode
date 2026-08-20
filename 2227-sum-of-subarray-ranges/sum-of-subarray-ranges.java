class Solution {
    public long subArrayRanges(int[] nums) {
    Stack<Integer> st=new Stack<>();

        int[] nxtg= new int[nums.length];
        int[] preg= new int[nums.length];

        int[] nxtsm= new int[nums.length];
        int[] presm= new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            while(st.size()>0 && nums[st.peek()]<=nums[i]){
                st.pop();
            }
            nxtg[i]=st.size() == 0 ? nums.length:st.peek();
            st.push(i);
        }

        st.clear();
        for(int i=0;i<nums.length;i++){
            while(st.size()>0 && nums[st.peek()]<nums[i]){
                st.pop();
            }
            preg[i]=st.size() == 0 ? -1:st.peek();
            st.push(i);
        }



        st.clear();
        for(int i=nums.length-1;i>=0;i--){
            while(st.size()>0 && nums[st.peek()]>=nums[i]){
                st.pop();
            }
            nxtsm[i]=st.size() == 0 ? nums.length:st.peek();
            st.push(i);
        }

        st.clear();
        for(int i=0;i<nums.length;i++){
            while(st.size()>0 && nums[st.peek()]>nums[i]){
                st.pop();
            }
            presm[i]=st.size() == 0 ? -1:st.peek();
            st.push(i);
        }


        long sum=0;
        long sumg=0;
        
        for(int i=0;i<nums.length;i++){
            long rightg =(nxtg[i]-i);
            long leftg = (i-preg[i]);

            long totalsubsg=(rightg*leftg);
            long contributiong=(totalsubsg*nums[i]);


            long right = (nxtsm[i]-i);
            long left= (i-presm[i]);
            
            long totalsubs=(right*left);
            long contribution=(totalsubs*nums[i]);
            sum=((sum+contribution));
            sumg=((sumg+contributiong));
        }

        return sumg-sum;
    }
}