import java.util.Scanner;
import static java.lang.System.*;
public class Prime_Checker_Boolean
{
    public static void  main(String[] args)
    {
        Scanner sc= new Scanner(in);
        out.print("Enter the number :");
        int n = sc.nextInt();
        if(n==2)
        {
            out.println(n+ " is a prime number");
        }
        else
        {
        boolean isPrime = true;  // Assuming the number is prime
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if (n % i == 0)   /* n is a multiple of i (i not equal to 1 or n ) */
                isPrime = false;
        }
        if (isPrime == true) {
            out.println(n + " is a prime number");
        } else {
            out.println(n + " is not  a prime number");
        }
    }
    }
}
