import java.util.Scanner;

public class Sum {
    public static int sum(int n){
        if(n==1){  //Based Class
            return 1;
        }
        int prvN=sum(n-1);
        return n+prvN;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}
