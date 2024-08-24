package myPackage;  // user defined package..package containing these are in the same package
public class Polymorphism {
    public static void main(String[] args){
        Deer d = new Deer();
        d.eat();  // Method overloading
    }
}
class animal{
    void eat(){
        System.out.println("eats anything");
    }
}

class Deer extends animal{
    void eat(){
        System.out.println("eats grass");
    }
}