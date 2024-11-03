import java.util.Scanner;


public class N_Queens    {

    static int count=0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = sc.nextInt();
        char[][] board =new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j =0;j<n;j++){
                board[i][j]='X';
            }
        }
        nQeens(board,0);
        System.out.println("Total ways: "+count);
    }

    public static boolean isSafe(char board[][],int row,int col){
        //vertical
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //left-diagonal
        for(int i=row-1,j=col-1;i>=0 && j>=0 ;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //right-diagonal
        for(int i=row-1,j=col+1;i>=0 && j<= board.length-1;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void nQeens(char board[][],int row) {

            if(row== board.length){
                printBoard(board);
                count++;
                return;
            }
            for(int j=0;j< board.length;j++){
                if(isSafe(board,row,j)==true) {
                    board[row][j] = 'Q';
                    nQeens(board, row + 1);
                    board[row][j] = 'X';
                }

            }
    }

    public static void printBoard(char[][] board){
        System.out.println("-------CHESS BOARD-------");
    for(int i=0;i< board.length;i++){
        for(int j=0;j< board.length;j++){
            System.out.print(board[i][j]+" ");
        }
        System.out.println("");
    }
    }
}
