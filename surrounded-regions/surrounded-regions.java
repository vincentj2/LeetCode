class Solution {
    int[] x_pos = new int[]{-1,0,1,0};
    int[] y_pos = new int[]{0,-1,0,1};
    public void solve(char[][] board) {
           int row = board[0].length; 
        int col = board.length; //칼럼길이 

        for (int i = 0; i < row; i++) {
            if (board[0][i] == 'O') {
                DFS(board, 0, i,col,row);
            }
            if (board[col - 1][i] == 'O') {
                DFS(board, col - 1, i,col,row);
            }
        }

        for(int i=0; i<col;i++){
            if(board[i][0]== 'O'){
                DFS(board,i,0,col,row);
            }
            if(board[i][row-1]=='O'){
                DFS(board,i,row-1,col,row);
            }
        }

        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                if(board[i][j]=='O') {
                    board[i][j] = 'X';
                }
                if(board[i][j]=='.'){
                    board[i][j]='O';
                }
            }
        }
    }

    private void DFS(char[][] board, int x, int y, int col, int row){
        if(x<0 || x>=col || y<0 || y>=row || board[x][y] != 'O'){
            return;
        }

        board[x][y] = '.'; // x로 변경 불가능한 부분 .로 변경
        for(int i=0; i<4;i++){
            DFS(board,x+x_pos[i],y+y_pos[i],col,row);
        }
    }
}