import java.util.Scanner;

public class User_Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = sc.nextInt();
        int prices[]=new int[n];
        for(int i =0;i<n;i++){
            prices[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            System.out.print(prices[i]+" ");
        }
    }
}
