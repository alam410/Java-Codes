public class Sudoku {

    public static boolean issafe(int[][] sudoku,int row,int col,int digit){

        //row
        for(int i=0;i<9;i++){
            if(sudoku[i][col]==digit){
                return false;
            }
        }
        //col
        for (int j=0;j<9;j++){
            if(sudoku[row][j]==digit){
                return false;
            }
        }
        //grid
        //starting row and column
        int sr=(row/3)*3; //রোকে ৩ দিয়ে ভাগ করলে আমাকে  int return করবে,১ম রো এর গ্রিড গুলোর জন্য r=0 to 2 ;যাকে ৩ দ্বারা ভাগ করলে আমি 0 পাব,একইভাবে ২য় টার জন্য 1 এবং ৩য়টার জন্য 2 পাব
        int sc=(col/3)*3;
        //3x3 grid
        for(int i=sr;i<sr+3;i++){
            for (int j=sc;j<sc+3;j++){
                if(sudoku[i][j]==digit){
                    return false;
                }
            }
        }

        return true;
    }
    public static boolean sudokuSolver(int sudoku[][],int row,int col){
        //base case
        //it means it has travesred all the elements
        if(row==9 && col==0){
            return true;
        }

        int nextRow= row,nextCol=col+1;
        if(col+1==9){
            nextRow=row+1;
            nextCol=0;
        }
        if(sudoku[row][col] !=0){
           return sudokuSolver(sudoku,nextRow,nextCol);
        }

        for(int digit=1;digit<=9;digit++){
            if (issafe(sudoku,row,col,digit)){
                sudoku[row][col]=digit;
                if(sudokuSolver(sudoku,nextRow,nextCol)){
                    return true;
                }
                sudoku[row][col]=0;
            }
        }
        return false;
    }

    public static void print_Sudoku(int sudoku[][]){
        for(int i =0;i< sudoku.length;i++){
            for (int j=0;j< sudoku.length;j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args){

        int sudoku[][]={
                {3,0,0,4,0,0,0,0,6},
                {0,0,2,5,0,0,0,0,0},
                {0,9,0,0,0,0,3,5,4},
                {9,0,0,8,0,0,5,0,0},
                {0,0,0,7,9,5,0,0,0},
                {0,0,3,0,0,2,0,0,7},
                {1,8,4,0,0,0,0,9,0},
                {0,0,0,0,0,6,2,0,0},
                {5,0,0,0,0,4,0,0,1} };

        if(sudokuSolver(sudoku,0,0)){  //starting array from 0,0
            System.out.println("Solution exists");
            print_Sudoku(sudoku);
        }
        else {
            System.out.println("Solution does not exists");
        }
    }
}
