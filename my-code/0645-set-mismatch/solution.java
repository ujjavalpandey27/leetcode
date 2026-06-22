class Solution {
    public int[] findErrorNums(int[] nums) {

        long sum=0;
        long actualsum=0;
        long sumsqr=0;
        long actualsumsqr=0;
        long n=nums.length;
        int[] ans= new int[2];
        for(int i=0;i<n;i++){
            sum+=(long)nums[i];
            sumsqr+=((long)nums[i]*(long)nums[i]);
            actualsum+=(long)(i+1);
            actualsumsqr+=((long)(i+1)*(long)(i+1));
            

        }

        long temp1=actualsum-sum;
        long temp2=actualsumsqr-sumsqr;
        ans[0]=(int)((temp2-(temp1*temp1))/(temp1*2));
        ans[1]=(int)((temp2+(temp1*temp1))/(temp1*2));
        return ans;
    }
}

