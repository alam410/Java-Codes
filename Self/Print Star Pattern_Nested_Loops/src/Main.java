import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter The Number: ");
    int n = sc.nextInt();
    for(int line = 1;line<=n;line++)
    {
        for(int j=1;j<=line;j++)
        {
            System.out.print("*");
        }
        System.out.println("");
    }
    }
}