import java.util.Scanner;

public class First_Occurance {
    public static int firstOccurance(int arr[],int n,int i){
        if(i== arr.length){  // it means we have checked the whole array still couldn't find the element
            return -1;
        }
        if(arr[i]==n){
            return i;  //if it matches then return the index value
        }
       return firstOccurance(arr,n,i+1);  //calling the next element to check if it matches the next element or not
                                //if it matches then returning the index value
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length :");
        int length = sc.nextInt();
        int arr[]= new int[length];
        System.out.print("Enter the elements:");
        for(int i =0;i<length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Enter the key:");
        int n = sc.nextInt();
        System.out.println(firstOccurance(arr,n,0)); //giving 0 because it will start checking from index no 0;

    }
}
