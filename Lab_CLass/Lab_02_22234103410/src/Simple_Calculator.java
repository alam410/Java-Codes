import java.util.Scanner;
public class Simple_Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Equation(ex:4 * 10):");
        int a = sc.nextInt();
        char operator = sc.next().charAt(0);
        int b = sc.nextInt();


        switch(operator)
        {
            case '+' : System.out.println(a+b);
                break;
            case '-' : System.out.println(a-b);
                break;
            case '*' : System.out.println(a*b);
                break;
            case '/' : System.out.println(a/b);
                break;
            case '%' : System.out.println(a%b);
                break;
            default: System.out.println("Wrong Operator");
        }

    }
}