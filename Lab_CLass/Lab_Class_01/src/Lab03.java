import java.util.Scanner;
public class Lab03{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the numbers:");
        for(int i =0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        //Arrays.sort(arr[n]);
        //System.out.println("Minmum number:"+arr[0]);
       // System.out.println("Maximum Number:" +arr[n-1];);

    }
}