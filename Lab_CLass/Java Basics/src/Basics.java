import java.util.Scanner;

public class Basics {
    //int main()
    public static void main(String[] args){
        //cin>>
        Scanner sc = new Scanner(System.in);
        //note:cin>>a
        int a=sc.nextInt();
        float b= sc.nextFloat();
        //note:cout<<"This is Lakad";
        System.out.print("THis is Lakad");//ln->endl
        System.out.println(b); //note: cout<<b
        //then cout<<a<<"is my Roll number";
        System.out.println(a+" is my Roll Number "+b);
    }
}
