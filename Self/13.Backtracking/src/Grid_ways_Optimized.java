import java.util.Scanner;

public class Grid_ways_Optimized {

    /** @time_complexity
     O(n+m) is the time complexity here */
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int fn_1=factorial(n-1);
        int fn=n*fn_1;
        return fn;
    }
    public static int gridWays(int i,int j,int n,int m){
        /*
        Equation: (n-1+m-1)! / (n-1)! * (m-1)!
         */

        int d=factorial(m-1);
        int r=factorial(n-1);
        int up=factorial(n-1+m-1);
        return up/(d*r);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int n = sc.nextInt();
        System.out.print("Enter the number of columns:");
        int m = sc.nextInt();

        System.out.println("Total Ways: "+gridWays(0,0,n,m));



    }
}
