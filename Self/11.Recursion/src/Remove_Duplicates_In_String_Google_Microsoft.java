import java.util.Scanner;

public class Remove_Duplicates_In_String_Google_Microsoft {
    public static void removeDuplicates(String str,int idx,StringBuilder newstr,boolean map[]){  //Using String Builder to execute the code faster && using boolean array map to check if repeated or not
        if(idx== str.length()){   //Base case if the strings are finished checking then it will print the final new string
            System.out.println(newstr);
            return;
        }
        //Work:checking if the character exists or not
        char current_ch =str.charAt(idx);
        if(map[current_ch-'a'] == true){
            //duplicate
            removeDuplicates(str,idx+1,newstr,map); //calling the next if it is duplicate
        }
        else {
            map[current_ch-'a']= true; //making the map array true so that if it comes again then find that it was already used
            removeDuplicates(str, idx+1, newstr.append(current_ch), map);  //adding the new char to the string builder
            //calling the next element  to continue to check up the process

        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String:");
        String str =sc.next();
        removeDuplicates(str,0,new StringBuilder(""),new boolean[26]); //taking boolean array of 26 alphabets

    }
}
