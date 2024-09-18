import java.time.LocalTime;
public class Task2{
    public static void main(String[] args){
        Computer.USB mouse = new Mouse();
        mouse.connect();
        mouse.disconnect();
        Computer.USB keyboard = new Keyboard();
        keyboard.connect();
        keyboard.disconnect();
    }
}
 class Computer {
    interface USB{
        void connect();
        void disconnect();
    }
}
class Keyboard implements Computer.USB{
    public void connect(){
        System.out.println("Connected at "+LocalTime.now());
    }
    public void disconnect(){
        System.out.println("Disconnected at "+LocalTime.now());
    }
}
class Mouse implements Computer.USB{
    public void connect(){
        System.out.println("Connected at"+LocalTime.now());
    }
    public void disconnect(){
        System.out.println("Disconnected at"+LocalTime.now());
    }
}
