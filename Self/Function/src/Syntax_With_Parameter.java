import java.util.Scanner;
import static java.lang.System.*;

import java.util.Scanner;
public class Syntax_With_Parameter
{
    public static  int Sum(int num1, int num2) //parameters or formal parameters
    {
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = Sum(a, b);   //arguments or actual parameters
        System.out.println("Sum is :" +sum);
    }
}
