import java.util.Scanner;
import static java.lang.System.*;
public class Hollow_Rhombus
{
    public static void hollowRhombus(int n){
        for(int i =1;i<=n;i++){
            //spaces
            for(int j = 1;j<=n-i;j++){
                out.print(" ");
            }
            //hollow rectangle - stars
            for(int j = 1;j<= n ;j++){
                if(i ==1 || i==n || j==1 || j==n){
                    out.print("* ");
                }
                else {
                    out.print("  ");
                }
            }
            out.println("");

        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        out.print("Enter the length :");
        int n = sc.nextInt();
        hollowRhombus(n);

    }
}
