import java.util.Scanner;

public class Main {
    public static void printDecrease(int n){ //Recurrence Function
        if(n==1){  //Base Case
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printDecrease(n-1);  //Recursion
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to Start Printing:");
        int n = sc.nextInt();
        printDecrease(n);
    }
}