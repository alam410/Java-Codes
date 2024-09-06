import java.util.Scanner;
public class Inverted_and_Rotated_Half_Pyramid
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        Stars(n);
    }
    public static void Stars(int n) {
        int i;
        for (i = 1; i <= n; i++) //lines
        {
            for (int j = 1; j <= n - i; j++) //spaces   because the spaces are like in the 1st line 4-1 = 3 spaces
                                            // in the second line the  spaces are like 4-2 = 2; 2 stars and 2 spaces
            {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) //stars
            {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}
