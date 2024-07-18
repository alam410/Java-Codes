import java.util.Scanner;
import static java.lang.System.*;
public class Character_Pattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(in);
        char ch ='A';
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                out.print(ch);
                ch++;
            }
            out.println();
        }
    }
}