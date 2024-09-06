import java.util.Scanner;

public class Diagonal_Sum
{
    public static int diagonal_sum(int numbers[][]){
        int sum=0;
        int n = numbers.length;
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    //primary
                    sum += numbers[i][j];
                }
                //secondary
                else if(i+j== n-1){
                    sum += numbers[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length:");
        int n = sc.nextInt();
        int numbers[][]=new int[n][n];
        System.out.println("Enter the numbers:");
        for(int i =0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                numbers[i][j]= sc.nextInt();
            }
        }
        System.out.print("Diagonal Sum:" +diagonal_sum(numbers));
    }

}
