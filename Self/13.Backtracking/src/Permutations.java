import java.util.Scanner;


public class Permutations {
    public static void find_Permutations(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i =0;i<str.length();i++){
            char current_ch =str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            find_Permutations(newStr,ans+current_ch);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        find_Permutations(str,""); //empty string to store the characters
    }
}
