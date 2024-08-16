import java.util.Scanner;

public class Sub_String {
    public static String sub_string(String str,int start,int end)
    {
        String substr="";//initializing with empty string
        for(int i=start;i<end;i++){
            substr += str.charAt(i);
        }
        return substr;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String:");
        String str = sc.nextLine();
        System.out.println("Enter the staring & Ending Index:");
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println(sub_string(str,start,end));
        //built-in substring
        System.out.println("Built in Result: "+str.substring(start,end));
    }
}
