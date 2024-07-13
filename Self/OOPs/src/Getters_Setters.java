public class Getters_Setters
{
    public static void main(String[] args)
    {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("Yellow");
        System.out.println(p1.getColor());

    }

    static class Pen
    {
        //properties
        private String color;
        private int tip;

        String getColor() {
            return this.color;  // this. is a speacial keyword of java .kind of pointer.The function that is calling; useful with varibales having the same name
        }

        int getTip() {
            return this.tip;
        }

        void setColor(String newColor)   //Setters setting the colours
        {

            color = newColor;
        }

        void setTip(int newTip) {

            tip = newTip;
        }
    }
}