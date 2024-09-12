import java.util.Scanner;

//note: Approach
/*
    1.Pivot:the element by which we will arrange the rest of the elements
        We will pick up the last element as pivot
    2.Partition: arrange the orders sequentially (just keeping the elements without sorting,just maintaining the order) smaller elements will be in front and the bigger elements will be in back
    3.QuickSort: Recursively call quicksort for left part
                 Recursively call quicksort for right part
 */
public class Quick_Sort
{
    public static void printArr(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    //note:this is a recursive function
    public static void quick_Sort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        //note:last element is the pivot
        int pivot_idx =partition(arr, si, ei);
        quick_Sort(arr,si,pivot_idx-1); //note:sorting the elements before the pivot
        quick_Sort(arr,pivot_idx+1,ei); //note:sorting the elements after the pivot

    }

    public static int partition(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i = si-1; //note: this is the i when i = -1
        //then it was making place for elements smaller than pivot
        //note:the partition will be done from staring index to ending index
        for(int j =si;j<ei;j++){
            if(arr[j]<=pivot){  //then if the element is smaller than pivot then we will make place for the element
                i++;
                //note:swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        //note:Placing the pivot in the right place
        i++; //then to do it we will start from where the partition is done ;that means the last i
        //info: swap
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the numbers: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        quick_Sort(arr,0, arr.length-1); //note :we are doing arr.length-1 because we  are starting from 0 index
        printArr(arr);
    }

}
