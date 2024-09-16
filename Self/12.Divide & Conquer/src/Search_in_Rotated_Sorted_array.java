import java.util.Scanner;

//note:Rotated around the pivot and sorted
public class Search_in_Rotated_Sorted_array {
    public static int search(int arr[],int tgt,int si,int ei){
        if(si>ei){
            return -1;
        }

        //note:work
        int mid = si + (ei-si)/2;
        if(arr[mid]==tgt){
            return mid;
        }
        if(arr[si]<= arr[mid]){  //then mid is on L1
            //note: case a (target on the left)
            if(arr[si]<=tgt && tgt<= arr[mid]){
                return search(arr,tgt,si,mid-1); //we need to check before the mid
            }
            else{ //note: case b (target on the right)
                return search(arr, tgt, mid+1, ei); //as the element is after mid that's why we added mid+1
            }

        }
        else {   //then mid is on L2
            //note: Case c (target on right)
            if(arr[mid] <= tgt && tgt <= arr[ei]){
                return search(arr, tgt, mid+1, ei);
            }
            else { //note: case d(tar)
                return search(arr, tgt, si, mid-1);
            }
        }


    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("The target:");
        int tgt=sc.nextInt();
        int index =search(arr,tgt,0,arr.length-1); //as we started from 0 that's why it's length-1
        if(index==-1){
            System.out.println("Not found the element!");
        }
        else
            System.out.print("Found "+tgt+" at index no "+index);

    }

}
