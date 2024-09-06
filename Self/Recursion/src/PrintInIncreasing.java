import java.util.Scanner;

public class PrintInIncreasing {
    public static void printIncrese(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        printIncrese(n-1);
        System.out.print(" "+n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncrese(n);
    }
}
