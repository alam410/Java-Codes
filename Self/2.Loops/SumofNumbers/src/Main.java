import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.print("Enter the amount of Numbers:");
        int n = sc.nextInt();
        int i=1;
        while(i<=n)
        {
            sum +=i;
            i++;
        }
        System.out.println("Total Sum: " +sum);


    }
}