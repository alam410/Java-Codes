import java.util.Scanner;
public class Selection_Sort {
    public static void selection_sort(int numbers[]){
        int n = numbers.length;
        for(int i =0;i<n-1;i++){
            int minPos=i;
            for(int j=i+1;j<n;j++){
                if(numbers[minPos]>numbers[j]){
                    minPos=j;
                }
            }
            //swap
            int temp=numbers[minPos];
            numbers[minPos]=numbers[i];
            numbers[i]=temp;
        }
    }
    public static void print_array(int numbers[]){
        int n = numbers.length;
        for(int i=0;i<n;i++){
            System.out.print(numbers[i]+" ");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length:");
        int n = sc.nextInt();
        int numbers[]=new int[n];
        System.out.println("Enter the numbers:");
        for(int i=0;i<n;i++){
            numbers[i]=sc.nextInt();
        }
        selection_sort(numbers);
        print_array(numbers);
    }
}
