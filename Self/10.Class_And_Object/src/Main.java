public class Main {
    public static void main(String[] args) {
        Animal Human = new Animal();  //Created an object named as Human
        Human.setName("Lakad Chowdhury");
        Human.setFood("Biscuits");
        Human.setLegs(2);
        System.out.println("Class Object name: "+Human.Name);
        System.out.println("Favourite Food: "+Human.Food);
        System.out.println("Total Legs: "+Human.legs);
    }

}

class Animal{
    String Name;
    String Food;
    int legs;
    void setName(String newName){
        Name=newName;
    }
    void setFood(String newFood){
        Food=newFood;
    }
    void setLegs(int newlegs){
        legs=newlegs;
    }
}