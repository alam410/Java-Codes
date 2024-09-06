import java.util.Scanner;

public class Diagonal_Sum_Optimized
{
        public static int diagonal_sum(int numbers[][]){
            int sum=0;
            int n= numbers.length;
            for(int i=0;i<n;i++){
                //primary diagonal
                sum += numbers[i][i];
                //secondary diagonal
                if(i != n-1-i)
                {
                    sum += numbers[i][numbers.length - 1 - i];
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

