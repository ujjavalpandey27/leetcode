class Solution {
    public int totalNQueens(int n) {
        int[] ans=new int[1];

        int[] leftrow=new int[n];
        int[] ud=new int[2*n-1];
        int[] ld=new int[2*n-1];
      
        helper(ans,leftrow,ud,ld,0,0,n);
        
        return ans[0];
    }
    public void helper(int[] ans,int[] leftrow ,int[] ud, int[] ld,int index,int column,int n){
        if(index==n){
            ans[0]+=1;
            return;
        }
        for(int row=0;row<n;row++){
            if(leftrow[row]==0 && ud[n-1+column-row]==0 && ld[column+row]==0){
                leftrow[row]=1;
                ud[n-1+column-row]=1;
               
                ld[column+row]=1;
                helper(ans,leftrow,ud,ld,index+1,column+1,n);
                leftrow[row]=0;
                ud[n-1+column-row]=0;
              
                ld[column+row]=0;



            }
        }}

     
}
