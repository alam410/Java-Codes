import java.util.Scanner;
import static java.lang.System.*;
public class Swap_Function {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        //swap
        int temp = a;
        a=b;
        b=temp;

        out.println("After Swap \nA:" +a+" B:"+b);
    }
}
