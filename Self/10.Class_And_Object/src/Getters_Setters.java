public class Getters_Setters {
    public static void main(String[] args){
        Pen Matador = new Pen();// Here Pen() is a constructor
        Matador.setType("High School");
        Matador.setColor("Blue");
        Matador.setTip_size(5);
        System.out.println(Matador.getType());
        System.out.println(Matador.getColor());
        System.out.println(Matador.getTip_size());
    }
}
class Pen{
private     String Type;  //Encapsulation is defined as the wraping up of data & methods under a single unit.Also implements data hiding.

private     int tip_size;
private     String color;

    String getType(){
        return this.Type;
    }
    int getTip_size(){
        return this.tip_size;
    }
    String getColor(){
        return this.color;
    }
    void setType(String Type){
        this.Type= Type;
    }
    void  setTip_size(int tip_size){
        this.tip_size=tip_size;
    }
    void setColor(String color){
        this.color=color;
    }

}
