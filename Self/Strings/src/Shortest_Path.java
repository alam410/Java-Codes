import java.util.Scanner;
public class Shortest_Path {
    public static double shortest_path(String str)
    {
        int n = str.length();
        int x =0;
        int y =0;
        for(int i=0;i<n;i++)
        {
            if (str.charAt(i) == 'E') {
                x++;
            } else if (str.charAt(i) == 'N' ) {
                y++;
            }
            else if(str.charAt(i) == 'S'){
                y--;
            }
            else if(str.charAt(i) == 'W'){
                x--;
            }
        }
        double displacement = Math.sqrt(((x*x)+(y*y)));
        return displacement;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Directions(N/S/E/W):");
        String str = sc.next();
        System.out.println("Shortest Path:"+shortest_path(str));
    }
}
