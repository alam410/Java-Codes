import java.util.Scanner;
public class Hollow_Rectangle {
    public static void main(String[] args)
    {
         //Scanner sc = new Scanner(System.in);
         //System.out.print("Enter the number of rows:");
         int row = 4;//sc.nextInt();
        // System.out.print("Enter the number of columns:");
         int col = 5; //sc.nextInt();
         Print_Stars(row,col);

    }

    public static void Print_Stars(int row,int col)
    {
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==1||i==4||j==1||j==5) //Boundary cells
                {
                    System.out.print("  *");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }
}
