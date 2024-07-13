import java.util.Scanner;
import static java.lang.System.*;
public class Half_Pyramid
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(in);
        out.println("Enter the number:");
        int n = sc.nextInt();
        for(int i = 1 ; i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                out.print(j);
            }
            out.println();
        }
    }
}
