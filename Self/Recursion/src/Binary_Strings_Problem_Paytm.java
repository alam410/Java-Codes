import java.util.Scanner;
public class Binary_Strings_Problem_Paytm {
    public static void printBinaryStrings(int n,int lastPlace,String str){
        //note:Base Case
        if(n==0){
            System.out.println(str); //when n = 0 that means there is no place for filling up that's mean we need to print now
            return;
        }
        /*
        if(lastPlace==0){   //checking if there was 0/1 in the last place
            printBinaryStrings(n-1,0,str.append("0")); //then after placing 0 we are filling up for n-1 elements
            //then we are calling our function and telling to do operation for n-1 and telling it the last place will be 0 and adding 0 to the StringBuilder
            printBinaryStrings(n-1,1,str.append("1"));//then we are calling our function and telling to do operation for n-1 and telling it  the last place willbe 1 and adding 1 to the StringBuilder
        }
        else {
            printBinaryStrings(n-1,0,str.append("0"));
         */
        //note: work (optimized)
        printBinaryStrings(n-1,0,str+"0"); //info: we needed to print 0 everytime
        if(lastPlace==0){
            printBinaryStrings(n-1,1,str+"1");  //when we got 0 then we can print both 1 and 0

        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n = sc.nextInt();
        System.out.println("Enter the Number You want to Begin your Binary Number with(0/1)");
        int lastplace= sc.nextInt();
        System.out.println("Possible Binary Strings:");
        printBinaryStrings(n,lastplace,"");
    }
}
