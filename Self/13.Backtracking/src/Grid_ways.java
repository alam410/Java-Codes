import java.util.Scanner;

//Time Complexity is O(2^n+m) ;which is very very bad
public class Grid_ways {
    public static int gridWays(int i,int j,int m,int n){
        if(i==n-1 && j==m-1){  //last cell
            return 1;
        }
        else if (i==n || j==m) { //crossing the gridlines
            return 0;
        }

        int w1=gridWays(i+1,j,n,m);
        int w2=gridWays(i,j+1,n,m);
        return w1+w2;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int n= sc.nextInt();
        System.out.print("Enter the number of columns:");
        int m= sc.nextInt();

        System.out.println(gridWays(0,0,n,m));



    }
}
