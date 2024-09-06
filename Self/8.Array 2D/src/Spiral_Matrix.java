import java.util.Scanner;

public class Spiral_Matrix {
    public static void spiral_matrix(int matrix[][])
    {
       int n = matrix.length;
        int start_Row=0;
        int end_Row=n-1;
        int start_Col=0;
        int end_Col=n-1;
        while(start_Row<=end_Row && start_Col <= end_Col)
        {
            //top
            for(int j=start_Col;j<=end_Col;j++){
                System.out.print(matrix[start_Row][j]+" ");
            }
            //right
            for(int i=start_Row+1;i<=end_Row;i++){
                System.out.print(matrix[i][end_Col]+" ");
            }
            //bottom
            for(int j=end_Col-1;j>=start_Col;j--){
                if(start_Row==end_Row){ //this codition is for so that it doesn't repeat the print again if there is left one box
                    break;
                }

                System.out.print(matrix[end_Row][j]+" ");
            }
            //left
            for(int i =end_Row-1;i>=start_Row+1;i--){
                if(start_Col==end_Col){  //same goes for here                    break;
                }
                System.out.print(matrix[i][start_Col]+" ");
            }
            start_Row++;
            end_Row--;
            start_Col++;
            end_Col--;

        }
        System.out.println("");

    }
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the length:");
       int n = sc.nextInt();
       int[][] matrix = new int[n][n];
       System.out.println("Enter the numbers:");
       for(int i =0;i<n;i++)
       {
           for(int j=0;j<n;j++)
           {
               matrix[i][j]=sc.nextInt();
           }
       }
        spiral_matrix(matrix);
    }
}
