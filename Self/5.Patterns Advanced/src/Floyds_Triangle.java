import java.util.Scanner;

public class Floyds_Triangle {
    public static void Numbers(int n)
    {
        int counter=1;
        for(int i =1 ;i<=n;i++) //outer
        {
            for(int j =1;j<=i;j++) //inner - how many times will counter be printed
            {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println("");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n =  sc.nextInt();
        Numbers(n);
    }
}
