import java.util.Scanner;

public class Factorial {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int fn1 = factorial(n-1);
        int fn = n*fn1;
        return fn;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
}
