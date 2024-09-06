import java.util.Scanner;

import static java.lang.System.*; //for not to repeat System lije we use  namespace std

public class Inverted_Stars
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(in);
        out.print("Enter the number: ");
        int n = sc.nextInt();
        for(int i = n;i>=0;i--)
        {
            for (int j = 1;j<=i;j++)
            {
                out.print("*");
            }
            out.println();
        }

    }
}
