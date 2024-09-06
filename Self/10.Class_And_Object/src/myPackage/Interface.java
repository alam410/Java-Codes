
public class Interface {
    public static void main(String[] args){
        Queen q = new Queen();
        q.moves();//Checking the moves
        User Lakad = new User();
        Lakad.check_color();
        Lakad.moves();

    }
}
interface ChessPlayer{
    //it's a blue print
    void moves();//By default, it's both public and abstraction
}

interface  Colour{
    void check_color();
}
class Queen implements ChessPlayer{
    public void moves(){ //we need to write down public here
        System.out.println("up,down,left,right,diagonal(in all 4 dirns)");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal-(by 1 step)");
    }
}

class User implements Colour,ChessPlayer{  //Example of Multiple Inheritance


    @Override
    public void check_color() {
        System.out.println("White");
    }

    @Override
    public void moves() {
        System.out.println("As per the rules!!");
    }
}
