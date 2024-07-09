import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Length of Square:");
        int a = sc.nextInt();
        if(a != 4 )
        {
            System.out.println("Sorry Not Possible right now");
        }
        else
        for(int i=0;i<a;i++)
        {
            System.out.println("****");
        }


    }
}