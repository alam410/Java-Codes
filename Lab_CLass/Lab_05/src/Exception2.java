import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception2 {
    public static void main(String[] args) {

        // write your code here
        int marks=0;
        try{
            FileInputStream file = new FileInputStream("assignment.txt");
            marks=10;
            System.out.println("Assignment Submitted Successfully");

        }
       catch(FileNotFoundException fnfe){
            System.out.println("Sorry sir, I was sick!");
        }
        finally{
            System.out.println("Your assignment marks is " + marks);
        }
    }
}