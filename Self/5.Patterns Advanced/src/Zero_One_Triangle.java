import java.util.Scanner;
public class Zero_One_Triangle {
    public static void Print_0_1(int n){

        for(int i =1 ;i<=n;i++){

            for(int j = 1;j<=i;j++){
                if( (i+j) % 2==0 )  // Because the 1's position was the sum of row and column (which was even)
                {
                    System.out.print("1 ");
                }
                else {
                    System.out.print("0 ");
                }

            }
            System.out.println("");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        Print_0_1(n);
    }
}
