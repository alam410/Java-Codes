import java.util.Scanner;

public class Task_02 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            triangle test = new triangle();
            System.out.println("Enter the lengths of the Triangle : ");
            System.out.print("A: ");int a= sc.nextInt();System.out.print("B: ");int b= sc.nextInt();System.out.print("C: ");int c = sc.nextInt();
            test.getArea(a,b,c);
            test.getPerimeter(a,b,c);
        }

}


interface polygon{
    void getArea(double a,double b,double c);
    void getPerimeter(double a,double b,double c);
}
class triangle implements polygon {
    @Override
    public void getPerimeter(double a, double b, double c) {
        double perimeter ;
        perimeter= a+b+c;
        System.out.println("The Perimeter of the Triangle: "+perimeter);
    }

    public void getArea(double a,double b,double c){
        double s = (a+b+c)/2;
        double area;
        area =Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The Area of the Triangle: "+area);
    }
}
