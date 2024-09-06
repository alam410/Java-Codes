import java.util.Scanner;

public class Palindrome {
    public static boolean palindrome(String str){
        int n = str.length();
        for(int i =0;i<n/2;i++){
            if(str.charAt(i)==str.charAt(n-i-1)){
                return  true;
            }
        }
        return false;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Word:");
        String str = sc.next();
        if(palindrome(str)==true){
            System.out.print("The word is a Palindrome");
        }
        else{
            System.out.print("No");
        }
    }
}
