import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Enter the numbers :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>=b && a>=c)
        {
            System.out.println("Largest Number:" +a);
        }
        else if(b>=c)
        {
            System.out.println("Largest Number is:" +b);
        }
        else
        {
            System.out.println("Largest Number :" +c);
        }
    }
}