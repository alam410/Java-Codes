import java.util.Scanner;

public class Function {
    //void->no return
    //int->return int

    public static int lakad_prints(int a,int b){
        int c = a+b;
        return c;
    }
    //main function
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(lakad_prints(a,b));


    }
}
