import java.util.Scanner;
public class Butterfly_Pattern {
    public static void Butterfly(int n){
        //1st half
        for(int i =1;i<=n;i++){
            //stars + spaces + stars
            // i     2*(n-i)    i
            for(int j =1;j<=i;j++)
            {
                System.out.print("*  ");
            }
            for(int j = 1;j<=2*(n-i);j++){
                System.out.print("   ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*  ");
            }
            System.out.println("");
        }

        //2nd Half
        for(int i=n;i>=1;i--)
        {
            //stars + spaces + stars
            // i     2*(n-i)    i
            for(int j =1;j<=i;j++)
            {
                System.out.print("*  ");
            }
            for(int j = 1;j<=2*(n-i);j++){
                System.out.print("   ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*  ");
            }
            System.out.println("");
        }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int n = sc.nextInt();
        Butterfly(n);
    }
}
