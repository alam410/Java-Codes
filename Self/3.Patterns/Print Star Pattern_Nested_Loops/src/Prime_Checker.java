import java.util.Scanner;
import static java.lang.System.*;
public class Prime_Checker
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(in);
        do {
            out.print("Enter the number :");
            int n = sc.nextInt();
            if(n==1 || n==0)
            {
                out.println("Not Prime Number");
                break;

            }
            int counter = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    counter++;
                }
            }
            if (counter > 1) {
                out.println("Not Prime Number");
            } else
                out.println("Prime Number");
        }while (true);

    }
}
