import java.util.Scanner;
public class Lab02{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int a =sc.nextInt();
        int b =sc.nextInt();
        System.out.println("What kind of Operator you want?");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        
        int operator =sc.nextInt();
        
        switch(operator)
        {
            case '1' :System.out.println(a+b);
            break;
            case '2' :System.out.println(a-b);
            break;
            case '3':System.out.println(a*b);
            break;
            case '4':System.out.println(a/b);
            break;
            default:System.out.println("Invalid Input");
        }

    }
}