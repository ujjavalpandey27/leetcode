class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int low=0;
        int high=mat.length*mat[0].length-1;

        while(low <=high){
            int mid=low+(high-low)/2;
            if(mat[mid/mat[0].length][mid%mat[0].length]==target){
                return true;
            }
            else if(mat[mid/mat[0].length][mid%mat[0].length]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        return false;
    }
}
