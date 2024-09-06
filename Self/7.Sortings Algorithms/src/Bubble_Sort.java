import java.util.Scanner;
public class Bubble_Sort {
    public static void bubble_sort(int numbers[]){
        int n = numbers.length;
        for(int turn =0;turn<n-1;turn++) //it's going from 0 turn to 3 turn if there are 5 elements in array
        {
            int swap=0;
            for(int j=0;j<n-1-turn;j++)
            {
                if(numbers[j]>numbers[j+1]){
                    //swap
                    int temp = numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                    swap++;
                }
            }
            if(swap==0){
                System.out.println("The array is already sorted!");
            break;
            }
        }
    }
    public static void print_bubble_sort(int numbers[]){
        int n = numbers.length;
        for(int i=0;i<n;i++){
            System.out.print(numbers[i]+" ");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array:");
        int n = sc.nextInt();
        System.out.println("Enter the numbers:");
        int numbers[]=new int[n];
        for(int i =0;i<n;i++){
            numbers[i]=sc.nextInt();
        }
        bubble_sort(numbers);
        print_bubble_sort(numbers);
    }
}
