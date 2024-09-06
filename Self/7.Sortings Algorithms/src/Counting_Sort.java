import java.util.Scanner;

public class Counting_Sort {
    public static void counting_sort(int[] arr){
        int largest = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i =0;i<n;i++){
            largest = Math.max(largest,arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i =0;i<n;i++){
            count[arr[i]]++;
        }
        int j =0;
        for(int i =0;i<count.length;i++){
            while(count[i]>0){
                arr[j]= i;
                j++;
                count[i]--;
            }
        }
    }

    public static void print_array(int arr[]){
        for(int i =0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Length of array:");
        int n = sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the numbers:");
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        counting_sort(arr);
        print_array(arr);
    }
}
