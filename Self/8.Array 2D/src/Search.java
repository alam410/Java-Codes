import java.util.Scanner;

public class Search {
    public static boolean search(int matrix[][],int key){
        int n = matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==key){
                    System.out.println("Element Found at (" +i+","+j+") cell");
                    return true;
                }
            }
        }
        System.out.println("Element not Found");
        return false;
    }

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
        System.out.print("Enter the element u want to find:");
        int key= sc.nextInt();
        search(matrix,key);

    }
}
