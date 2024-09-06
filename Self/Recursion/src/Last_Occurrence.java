import java.util.Scanner;

public class Last_Occurrence {
    public static int lastOccurrence(int arr[],int n,int i){
        if(i== arr.length){  //it means it has traveled all the elements
            return -1;
        }
        int isFound = lastOccurrence(arr,n,i+1);  //looking ahead of self if there is any other same element exists
        if(isFound != -1 ){  //it means it got something valid index of the same element
                            //as it found next element that's why it's returning the index
            return isFound;
        }
        //check with self
        if(arr[i]==n){
            return i;
        }

        return isFound;
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
        System.out.println(lastOccurrence(arr,n,0));
    }
}
