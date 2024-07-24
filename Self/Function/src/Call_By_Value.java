import java.util.Scanner;
public class Call_By_Value
{
    public static void swap(int a,int b) //Here it is passing just the copy of the value but it's not an orginal pass
    {
        int temp = a ;
        a = b;
        b = temp;
        System.out.println("In the swap function \nA:"+a+" B:"+b);// Here all the operation is doing on the copy version of the variables
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values by spaces:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        swap(a,b);
        System.out.println("In the main Function \nA:"+a+" B:"+b);  // In here it is doing the operation on the main value
                                                                    // that's why when we are calling the values it is working on the values of main
    }
}
