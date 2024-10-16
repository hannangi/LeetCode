package LeetCode;
public class GameOfLife {
    private int[][] directions = new int[][]{{0,1},{1,0},{-1,0},{0,-1},{-1,-1},{-1,1},{1,-1},{1,1}};
    static int[][] board = new int[][]{{0,1,0},{0,0,1},{1,1,1},{0,0,0}};

    public  int[][] gameOfLife(int [][] board){
        // int[][] returnBoard = new int[board.length][board[0].length];

        for(int i=0;i<board.length;i++){

            for(int j=0;j<board[0].length;j++){
                if(board[i][j] == 1){
                    int activeNeigh = getActiveNeigh(board,i,j);

                    if(activeNeigh<2 || activeNeigh >3){
                        board[i][j]=-2; // 0
                    }
                }else if (board[i][j]==0){
                    int activeNeigh = getActiveNeigh(board,i,j);

                    if(activeNeigh ==3){
                        board[i][j]=3; // will become active in next state
                    }
                }

            }            
        }
        updateBoard(board);
        return board;

    }

    private int getActiveNeigh(int[][] board, int row,int col){
        int activeNeigh=0;

        for(int[] direction : directions){
            int newRow = row + direction[0];
            int newCol = col + direction[1];

            if(newRow >=0 && newRow<board.length && newCol >=0 && newCol < board[0].length && 
            (board[newRow][newCol]==1 || board[newRow][newCol] == -2)){
                activeNeigh++;
            }
        }
        return activeNeigh;

    }
    private void updateBoard(int[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==-2){
                    board[i][j]=0;
                }
                if(board[i][j]==3){
                    board[i][j]=1;
                }
            }
        }
    }


    public static void main(String[] args) {
        GameOfLife gol = new GameOfLife();
        int[][] gameBoard = gol.gameOfLife(board);
        for (int row = 0; row < gameBoard.length; row++) {
            for (int col = 0; col < gameBoard[0].length; col++) {
                System.out.print(gameBoard[row][col]);
            }
            System.out.print('\n');
        }
    }
}
