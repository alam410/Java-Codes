import java.util.Scanner;

public class Prime_OR_Not_Optimized
{
    public static boolean isPrime(int n)
    {
        if(n == 2){
            return true;
        }
      for(int i=2;i<=Math.sqrt(n);i++)  //builtin function of math for sqrt
      {
          if(n % i == 0) {
              return false;
          }
      }
      return true;
    }
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check Prime:");
        int n = sc.nextInt();
        boolean check=isPrime(n);
        if(check == true)
        {
            System.out.println(n+" is a prime number");
        }
        else
            System.out.println(n+ " is not a prime number");
    }
}
