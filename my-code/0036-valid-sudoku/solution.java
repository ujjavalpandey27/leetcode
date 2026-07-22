class Solution {
    public boolean isValidSudoku(char[][] board) {
            return helper(board,0,0);
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
        if(board[row][column]=='.'){
            return helper(board,nextrow,nextcol);
        }
        if(issafe(board,row,column,board[row][column])){
            if(helper(board,nextrow,nextcol)==true){
                return true;
            }

        }
        return false;
          
        }
        
    
    public boolean issafe(char[][] board,int row,int column,char target){
        for(int i=0;i<9;i++){
            if(i!=column && board[row][i]==target){
                return false;
            }
            if(i!=row && board[i][column]==target){
                return false;
            }
            int boxr=3*(row/3)+i/3;
            int boxc=3*(column/3)+i%3;
            if((boxr!=row || boxc!=column) && board[boxr][boxc]==target){
                return false;
            }
            
        }
        return true;
    }
    }

