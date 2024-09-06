import java.util.Scanner;

public class Check_Sorted_Array {

    public static Boolean chekc_Sorted(int arr[],int i)
    {
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]> arr[i+1]){
            return false;
        }
        return chekc_Sorted(arr,i+1);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length:");
        int length = sc.nextInt();
        System.out.println("Enter the arrays:");
        int[] arr = new int[length];
        for (int i =0;i<length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Enter the index no You want to start Check:");
        int n = sc.nextInt();
       if(chekc_Sorted(arr,n)== true){
           System.out.println("Sorted Array");
       }
       else {
           System.out.println("Not Sorted");
       }
    }
}
