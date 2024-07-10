import java.util.Scanner;
public class Lab05{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n =sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++)
        {
            sum += i;
        }
        System.out.println(sum);
    }
}