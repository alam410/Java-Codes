import  java.util.Scanner;
import  static java.lang.System.*;
public class Product_Of_A_B
{
    public static int Product(int a,int b)
    {
        int mul = a*b;
        return mul;
    }
    public static  void main(String[] args)
    {
        Scanner sc = new Scanner(in);
        out.println("Enter two values:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = Product(a, b); // Storing the values into a new varibale so that we do not lose the return value
        out.println("After the Multiplication:" +product);
        product = Product(15,15);
        out.println("\nAfter the By default product:"+product);

    }
}
