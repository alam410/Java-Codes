import java.util.Scanner;
public class Binomial_Coefficient {
    public static int factorial(int n)
    {
        int f=1;
        for(int i = 1;i<=n;i++)
        {
            f *=i;
        }
        return f;
    }
    public static int Binomial(int n,int r)
    {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int sub_fact = factorial(n-r);
        return n_fact/(r_fact*sub_fact);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("Enter the value of r:");
        int r = sc.nextInt();
        System.out.println("The Binomial Coeffiecent is :" +Binomial(n,r));

    }
}
