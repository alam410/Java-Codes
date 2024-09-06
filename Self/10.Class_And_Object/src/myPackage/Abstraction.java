

public class Abstraction
{
    public static void main(String[] args){
        Horse h = new Horse();
        h.walk();
        h.eat();
        //ANIMAL a = new ANIMAL(); //We can not use it as object because as it's a abstract class
        }
}

abstract class ANIMAL{
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk(); //here it just gives the idea of the function doesn't give implementation
}

class Horse extends ANIMAL{   //class horse must implement walk() method
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}