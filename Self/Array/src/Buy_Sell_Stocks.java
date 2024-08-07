import java.util.Scanner;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Buy_Sell_Stocks {
    public static int buyAndsell(int prices[]) {
        int maximum_profit = 0;
        int n = prices.length;
        int buying_price = Integer.MAX_VALUE;
        for(int i =0;i<n;i++){
            if(buying_price<prices[i]){
                int profit=prices[i]-buying_price;
                maximum_profit=max(maximum_profit,profit);
            }
            else{
                buying_price=prices[i];
            }
        }
        return maximum_profit;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        out.print("Enter the number of days:");
        int n = sc.nextInt();
        out.println("Enter the prices:");
        int[] prices= new int[n];
        for(int i =0;i<n;i++){
            prices[i]= sc.nextInt();
        }
        out.println(buyAndsell(prices));
    }
}
