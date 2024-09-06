import java.util.Scanner;
import static java.lang.System.*;
public class Number_Pyramid {
    public static void number_pyramid(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j = 1;j<=n-i;j++){
                out.print(" ");
            }
            //numbers
            for(int j =1;j<=i;j++){
                out.print(i+" ");

            }
            out.println("");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        out.println("Enter the number of Row: ");
        int n = sc.nextInt();
        number_pyramid(n);
    }
}
