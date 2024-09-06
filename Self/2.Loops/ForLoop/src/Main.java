import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many times you want to Print?");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Hello World!");
        }
    }
}