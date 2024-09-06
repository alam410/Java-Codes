import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            //It will take input as Row wise
            System.out.print("Enter the length:");
            int n = sc.nextInt();
            int matrix[][]=new int[n][n];
            for(int i =0;i<n;i++){
                for(int j=0;j<n;j++){
                    matrix[i][j]= sc.nextInt();
                }
            }
        //output
        //total inputs have to be: row × column;
        //if row and columns are 3 :then inputs should be 9
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println(""); //giving a new column after each row
        }

        }
}