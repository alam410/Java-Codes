package myPackage;
public class Inheritance {

    public static void main(String[] args){
        Fish Shark = new Fish();
        Shark.eat();
        Dog dobby = new Dog();
        dobby.legs= 4;
        System.out.println(dobby.legs);

    }
}
//Base class
class Animals{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breaths");
    }
}
//Derived Class
class Fish extends Animals{ //Single level Inheritance
    // for inheritance from Animal
    int fins;
    void swim(){
        System.out.println("swims in water");
    }
}
//Multi level Inheritance
class Mamal extends Animals{
    int legs;
}
class  Dog extends Mamal{
    String breed;
}