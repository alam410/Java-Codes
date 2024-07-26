import java.util.Scanner;

public class Palindromic_Pattern {    //same pattern if we mirror image that word  ; like : madam ,noon , 121 , 1332331;
    public static void palindromicPattern(int n){
        for(int i =1 ; i<=n ;i++){
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");   //spaces
            }
            for(int j=i;j>=1;j--){  // loop for descending order numbers
                System.out.print(j+" ");
            }
            for(int j=2;j<=i;j++){   // loop for ascending order numbers
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        palindromicPattern(n);
    }
}
