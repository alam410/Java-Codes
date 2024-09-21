import java.util.Scanner;

public class array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //cin>>n

        //int arr[n];
        int n = sc.nextInt();;
        int arr[]=new int[n];
     //n--5
        //float arr[94]
        float arr2[]=new float[n];
        //for(int i=0;i<arr.length;i++)

        for(int i =0;i<arr.length;i++){ //arr.length = 5
            //cin>>arr[i]
            arr[i]=sc.nextInt();
        }

        for(int i=0;i< arr2.length;i++){
            arr2[i]=sc.nextFloat();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
}
