import java.util.Scanner;

public class String_Compression {
    public static String compress(String str){
        StringBuilder sb = new StringBuilder("");

        for(int i=0;i<str.length();i++){
            Integer count = 1; //taking it as INTEGER class so that later i could add it as a string
            while(i<str.length()-1 && str.charAt(i)== str.charAt(i+1)) {  //checking & counting the elements
            count++;
            i++;
            }
            sb.append(str.charAt(i));
            if(count>1){   //printing the numbers like a3b2..
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:" );
        String str = sc.next();
        System.out.println(compress(str));

    }
}
