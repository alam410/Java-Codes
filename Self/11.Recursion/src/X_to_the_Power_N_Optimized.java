import java.util.Scanner;

public class X_to_the_Power_N_Optimized {
    public static long  optimized_power(long x,long n){
        if(n==0){
            return 1;
        }
        //avoiding calling the function twice to minimize time complexity
        // int halfPowerSq=optimized_power(x,n/2) *optimized_power(x,n/2);  //If the exponential is even
        //2^10 = 2^5 * 2^5
        long  halfPower= optimized_power(x,n/2); //calling the function one time
        long  halfPowerSq= halfPower*halfPower; //then repeating calling the stored values again


        if(n%2!=0){  //if the exponent is odd
            halfPowerSq= x*halfPowerSq;
            //2^5 = 2 * 2^2 * 2^2
        }
        return halfPowerSq;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long x = sc.nextInt();
        System.out.print("Enter the exponential: ");
        long n = sc.nextInt();
        System.out.println("The result is: "+optimized_power(x,n));
    }
}
