import java.util.Scanner;

public class Largest_String_Lexicographically {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         /*
         lexicographically
        the arrangement of given elements according to Alphabetical order
         str1.compareTo(str2) // 'A'!= 'a'
         str1.comparetoIgnoreCase(str2) //'A' == 'a'
         =>
                0 : equal
         (-ve) <0 : str1< str 2
         (+ve) >0 : str1> str 2
          */
        System.out.print("Enter the number of strings: ");
        int n = sc.nextInt();
        String arr[]=new String[n];//String array for storing multiples strings
        for(int i =0;i<n;i++){
            arr[i]= sc.next();
        }
        String largest = arr[0];
        for(int i=1;i<n;i++){
            if(largest.compareTo(arr[i])<0){
                largest=arr[i];
            }
        }
        System.out.println("Lexicographically Largest String:"+largest);


    }
}
