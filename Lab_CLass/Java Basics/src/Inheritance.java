import java.util.Scanner;

public class Inheritance {
    public static  void  main(String[] args){
    Ten Ratna = new Ten();
    Ratna.Physics=95;
    Ratna.Chemistry=96;
    Ratna.HM=99;
    Ratna.BIO=93;
    System.out.println(Ratna.sum());
    }
}

class Nine{
    public int Physics;
    public int Chemistry;
    public int Result(){
        int result = Physics+Chemistry;
        return result;
    }
}

class Ten extends Nine {
    int HM;
    int BIO;

    public int sum(){
        int Result =Physics+Chemistry+HM+BIO;
        return Result;
    }

}
