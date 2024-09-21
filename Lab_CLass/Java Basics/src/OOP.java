import java.util.Scanner;

public class OOP {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Java obj1 = new Java();
        obj1.set_password(410);
        obj1.files="Lakad";
        System.out.println(obj1.files);
        System.out.println(obj1.getPassword());
        Ratna ob2 = new Ratna();


    }
}
 class Java{
     int password;//encapsulation ->hide -> abstraction
    public String files;
    public void set_password(int pwd){
        password=pwd;
    }
    public int getPassword(){
        return password;
    }
}

class Ratna{
   public int id;

}