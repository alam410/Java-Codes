import java.util.Scanner;

public class X_to_the_Power_N {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return x;
        }
        int X = x * power(x, n-1);
        return X;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        System.out.print("Enter the exponential: ");
        int n = sc.nextInt();
        System.out.print("The result is:" + power(x,n));
    }
}
