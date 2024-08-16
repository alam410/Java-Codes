import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        char[] array = {'a', 'b', 'c', 'd'};
        String str = "abcd";
        String str2 = new String("xyz");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your nickname: ");
        String nickname = sc.next(); // Read a single word
        sc.nextLine(); // Consume the leftover newline character;So that I can take the next string whole input

        System.out.println("Nickname: " + nickname);

        System.out.print("Enter your Full name: ");
        String fullName = sc.nextLine(); // Read the entire line

        System.out.println("Full name: " + fullName);

        System.out.println("Total Length of Nickname = "+nickname.length());

        //Concatenation
        String whole_Name = fullName+" ("+nickname+")";
        System.out.println("Your Name is:"+whole_Name);
        //Finding out the element of String
        System.out.print("The Position No you want to know:");
        int n = sc.nextInt();
        System.out.println(whole_Name.charAt(n));
        //for printing the whole strings
        print_letters(whole_Name);
    }
    public static void print_letters(String whole_Name){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Starting Position:");
        int start = sc.nextInt();
        System.out.print("Enter the Ending Position:");
        int end = sc.nextInt();

        for(int i =start;i<=end;i++){
            System.out.print(whole_Name.charAt(i)+" ");
        }
    }
}
