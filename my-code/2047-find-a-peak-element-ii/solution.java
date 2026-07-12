class Solution {
    public int[] findPeakGrid(int[][] mat) {
        
    int low=0;
        int high=mat[0].length-1;
        
        while(low<=high){
            int mid=low+(high-low)/2;
            int rowmax=0;
            for(int i=0;i<mat.length;i++){
                if(mat[i][mid]>mat[rowmax][mid]){
                    rowmax=i;
                }
            }
            
            int left=(mid>0)?mat[rowmax][mid-1]:-1;
            int right=(mid<mat[rowmax].length-1)?mat[rowmax][mid+1]:-1;
            int at=mat[rowmax][mid];
            if(at>left && at> right){
                return new int[] {rowmax,mid};
            }
            else if(left>at){
                high=mid-1;

            }
            else{
                low=mid+1;
            }



            
        }
        return new int[] {};
      }
}
