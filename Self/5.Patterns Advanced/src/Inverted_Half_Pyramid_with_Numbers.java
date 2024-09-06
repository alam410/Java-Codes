import java.util.Scanner;
public class Inverted_Half_Pyramid_with_Numbers {
    public static void Numbers(int n) {
        for(int i =1 ;i<=n;i++)//rows
        {
            for(int j=1;j<=n-i+1;j++)//numbers
            {
                System.out.print(j+" ");
            }

            System.out.println("");
        }
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int n = sc.nextInt();
        Numbers(n);
    }
}
