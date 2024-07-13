import java.util.Scanner;
public class EnterMultipleOf10
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a Number:");
            int n = sc.nextInt();
            if(n%10==0) {
                System.out.println("Welldone, " + n + " is a correct answer");
                break;
            }
            System.out.println(n+" is not Multiplier of 10");
        } while(true);
    }
}
