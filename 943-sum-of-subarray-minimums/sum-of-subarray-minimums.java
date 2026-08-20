class Solution {
    public int sumSubarrayMins(int[] arr) {
        Stack<Integer> st=new Stack<>();
        
        int[] nxtsm= new int[arr.length];
        int[] presm= new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            while(st.size()>0 && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            nxtsm[i]=st.size() == 0 ? arr.length:st.peek();
            st.push(i);
        }
        st.clear();
        for(int i=0;i<arr.length;i++){
            while(st.size()>0 && arr[st.peek()]>arr[i]){
                st.pop();
            }
            presm[i]=st.size() == 0 ? -1:st.peek();
            st.push(i);
        }
        int sum=0;
        int mod=1000000007;
        for(int i=0;i<arr.length;i++){

            long right = nxtsm[i]-i;
            long left= i-presm[i];


            long totalsubs=(right*left)%mod;
            long contribution=(totalsubs*arr[i])%mod;
            sum=(int)((sum+contribution)%mod);
        }

        return sum;
        

    }
}