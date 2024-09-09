import java.util.Scanner;
//note: Approach
/*
    1.Divide: Find the mid
        ->Mid =(si-ei)/2  ;good for smalls arrays, but it will overflow if it was a bigger array
        ->Mid =si+(ei-si)/2 ; it will give the same output but rather than overflowing it will do it
    2.Mergesort from left & mergesort from right using recursion
    3.Finally, Merge
        ->for merge we will be using temporary array of size same as main array
        ->storing the elements using comparing the divided arrases
 */
public class Merge_Sort {
    public static void merge_sort(int arr[],int si,int ei){
        if(si>=ei){ //then it means we have traversed through all the elements
            return;
        }

        int mid = si+ (ei-si)/ 2;
        merge_sort(arr,si,mid); //info:left part
        merge_sort(arr,mid+1,ei); //info:right part
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[] = new int[ei-si+1]; //note: left(0,3)->4 elements ; right(4,6)->3 elements; length = 6-0+1 =7
        int i = si; //note:iterator for left part
        int j = mid+1;//note:iterator for right part
        int k = 0;//note:iterator for temp array
        while(i<=mid && j <=ei){
            if(arr[i]< arr[j]){
               //note: comparing and storing the values into array
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;  //info:no matter what after iteration the index will move for the next element
        }
        //note: leftovers of left part
        while ( i<=mid ){
            temp[k++] = arr[i++];  //info: same of what \ we did in immediate while loop
        }
        //note: leftovers of right part
        while ( j<=ei ){
            temp[k++] = arr[j++];  //info: same of what \ we did in immediate while loop
        }
        //note: copying temp back to original array
        for(k=0,i=si;k< temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void printArray(int arr[]){
        int n = arr.length;
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        merge_sort(arr,0, arr.length-1);
        printArray(arr);
    }
}