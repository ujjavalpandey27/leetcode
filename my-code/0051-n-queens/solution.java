class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans =new ArrayList<>();

        int[] leftrow=new int[n];
        int[] ud=new int[2*n-1];
        int[] ld=new int[2*n-1];
        int[] queens=new int[n];
        helper(ans,leftrow,ud,ld,queens,0,0,n);
        
        return ans;
    }
    public void helper(List<List<String>> ans,int[] leftrow ,int[] ud, int[] ld,int[] queens,int index,int column,int n){
        if(index==n){
            create(queens,ans,n);
            return;
        }
        for(int row=0;row<n;row++){
            if(leftrow[row]==0 && ud[n-1+column-row]==0 && ld[column+row]==0){
                leftrow[row]=1;
                ud[n-1+column-row]=1;
                queens[row]=column;
                ld[column+row]=1;
                helper(ans,leftrow,ud,ld,queens,index+1,column+1,n);
                leftrow[row]=0;
                ud[n-1+column-row]=0;
                queens[row]=0;
                ld[column+row]=0;



            }
        }}

        public void create(int[] queens,List<List<String>> ans,int n){
            List<String> mini=new ArrayList<>();
            StringBuilder s= new StringBuilder();

            for(int i=0;i<n;i++){
                s.append('.');
            }
            for(var i: queens){
                s.setCharAt(i,'Q');
                mini.add(s.toString());
                s.setCharAt(i,'.');
            }
            ans.add(new ArrayList<>(mini));
        }

    
}
