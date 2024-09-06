import java.util.Scanner;

public class Tiling_Problem_Amazon {
    public static int tillingProblem(int n){ //2 * n (floor size)

        if(n==0 || n==1){
            return 1;
        }
        //work
        //vertical choice
        int Fn_1 = tillingProblem(n-1); //after placing 1 tiles vertically there will be remaining n-1 Space
        //Then To fill the n-1 space we need to call the F(n-1) function again

        //horizontal choice
        int Fn_2 = tillingProblem(n-2);
        int totalWays = Fn_1+Fn_2;
        return totalWays;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Floor Size (2×n): ");
        int n = sc.nextInt();
        System.out.println("Total ways to Fill up :"+tillingProblem(n));

    }

}
