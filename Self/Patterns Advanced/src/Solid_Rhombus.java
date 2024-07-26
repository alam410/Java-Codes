import java.util.Scanner;
public class Solid_Rhombus {
    public static void Rhombus(int n){

        for(int i = 1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");   // spaces
            }
            for(int j = 1;j<=n;j++){

                System.out.print("* ");   // stars as each line was containing stars
                                        // equvalent to n stars that's why it was compared with n
            }

            System.out.println("");
        }
    }

    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the length of Rhombus:");
            int n = sc.nextInt();
            Rhombus(n);
    }
}
