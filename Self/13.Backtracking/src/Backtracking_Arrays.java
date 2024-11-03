import java.util.Scanner;

public class Backtracking_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the value: ");
        int val = sc.nextInt();
        changeArr(arr,0,val);
        printArr(arr);

    }
    public static void changeArr(int arr[],int i,int val){
        if(i== arr.length){
        printArr(arr);
        return;
        }
        //recursion
        arr[i]=val;
        changeArr(arr, i+1, val+2);  //function call step
        arr[i]=arr[i]-2;  //backtracking step
    }
    public static void printArr(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}