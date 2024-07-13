public class Access_Modifiers {
    public static void main(String[] args)
    {
        Pen p1 = new Pen();//created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "Lakad CHowdhury";
        //myAcc.password ="22234103410";//You cann't access from this way
        myAcc.setPassword("22234103410");

    }
}
class BankAccount{
    public String username; // Saviour example of package with the example of access modifiers with Google Maps,Payment & Chrome
    private String Password;
    public void setPassword(String pwd)
    {
        Password = pwd;
    }
}
class Pen
{
    //properties
    String color;
    int tip;

    void setColor(String newColor)
    {

        color = newColor;
    }
    void setTip(int newTip)
    {

        tip = newTip;
    }
}

/*class Student{
    String name;
    int age;
    float percentage; //CGPA

    void calcPercentage(int phy,int chem,int math)
    {
        percentage = (phy+chem+math) / 3;
    }
}
*/