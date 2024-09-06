import java.util.Scanner;

public class Friends_Pairing_Golden_Sachs {

    public static int friends_pairings(int n){

        if(n==1||n==2){  //based cases
            return n;
        }
//        choices
//        //single
//        int fn_1 = friends_pairings(n-1);
//
//        //pair
//        int fn_2 = friends_pairings(n-2);
//        int pair_ways = (n-1)*fn_2;
//
//        int total_ways = fn_1+pair_ways;
//        return total_ways;

        return friends_pairings(n-1)+ (n-1)* friends_pairings(n - 2);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Friends:");
        int n = sc.nextInt();
        System.out.println("Number of ways of Pairs:"+friends_pairings(n));
    }
}
