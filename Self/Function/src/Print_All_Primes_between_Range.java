import java.util.Scanner;
import static java.lang.System.*;
public class Print_All_Primes_between_Range {
    public static boolean Prime(int n)
    {
        if(n==2)
        {
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n % i ==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void PrimesInRange(int s,int n)
    {

        int numbers=0;
        for(int i=s;i<=n;i++)
        {
            if(i==1||i==0)
            {
                continue;   //skiping the loop
            }
            if(Prime(i)==true)
            {
                out.print(i+ " ");
                numbers++;
            }
        }
        out.println("\nTotal Prime Numbers:"+numbers);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(in);
        out.print("Enter the starting:");int s = sc.nextInt();
        out.print("Enter the ending:");int n= sc.nextInt();
        out.println("The prime numbers in the range are:") ;
        PrimesInRange(s,n);
    }
}
