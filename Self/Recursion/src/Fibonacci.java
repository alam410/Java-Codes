import java.util.Scanner;

public class Fibonacci {
    //fibonacci -> 0,1,1,2,3
    //fibonacci -> 0,1,(0+1),(1+1),(1+2)
    public static int print_fibonacci(int n){

        //We need two base cases here as we need two fibonacci to count the sum
        //Another reason is as there is two base cases
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int fn1=print_fibonacci(n-1);
        int fn2=print_fibonacci(n-2);
        return fn1+fn2;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to print Nth fibonacci number:");
        int n = sc.nextInt();
        System.out.println(print_fibonacci(n));
    }
}
