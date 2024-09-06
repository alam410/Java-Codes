import java.util.Scanner;
public class Insertion_Sort {
    public static void insertion_sort(int numbers[]){
        int n = numbers.length;
        for(int i=1;i<n;i++){
            int curr_element=numbers[i];
            int prev= i-1;
            //finding out the correct pos to insert
            while(prev>= 0 && (numbers[prev] > curr_element) ){
                numbers[prev+1] = numbers[prev];
                prev--;
            }
            //insertion
            numbers[prev+1]= curr_element;
        }
    }
    public static void print_array(int numbers[]){
        int n = numbers.length;
        for(int i=0;i<n;i++){
            System.out.print(numbers[i]+" ");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length:");
        int n = sc.nextInt();
        int numbers[]=new int[n];
        System.out.println("Enter the numbers:");
        for(int i=0;i<n;i++)
        {
            numbers[i]= sc.nextInt();
        }
        insertion_sort(numbers);
        print_array(numbers);

    }
}
