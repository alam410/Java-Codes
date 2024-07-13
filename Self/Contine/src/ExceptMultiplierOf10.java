import java.util.Scanner;
public class ExceptMultiplierOf10 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter a Number:");
            int n = sc.nextInt();
            if(n%10==0)
            {
                System.out.println("Skipped");
                continue;
            }
            System.out.println("You Entered : " +n);
        }while(true);
    }

}
