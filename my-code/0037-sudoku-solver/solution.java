class Solution {
    public void solveSudoku(char[][] board) {
          helper(board,0,0);
    }
    public boolean helper(char[][] board,int row,int column){
        if(row==9){
            return true;
        }
        int nextrow=row;
        int nextcol=column+1;
        if(column==8){
            nextrow=row+1;
            nextcol=0;
        }
        if(board[row][column]!='.'){
            return helper(board,nextrow,nextcol);
        }

            for(char i='1';i<='9';i++){
                if(issafe(board,row,column,i)){
                    board[row][column]=i;
                 if(helper(board,nextrow,nextcol)==true){
                    return true;
                 }

                    board[row][column]='.';
                }

            }
            return false;
        }
        
    
    public boolean issafe(char[][] board,int row,int column,char target){
        for(int i=0;i<9;i++){
            if(board[row][i]==target){
                return false;
            }
            if(board[i][column]==target){
                return false;
            }
            if(board[3*(row/3)+i/3][3*(column/3)+i%3]==target){
                return false;
            }
            
        }
        return true;
    }
}
