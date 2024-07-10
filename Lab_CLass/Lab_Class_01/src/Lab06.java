public class Lab06{
    public static void main(String Args[])
    {
        Customer a = new Customer();
        a.setName("Lakad Chowdhury");
        System.out.println(a.getName());

    }
}
class Customer
{
    private 
    String name;
    int cusID;
    int bankAcc;


    public String getName(){
        return name;
    } 
    public int getID()
    {
        return cusID;
    }

    public int getAccount()
    {
        return bankAcc;
    }

    
    public void setName(String newName){
        this.name=newName;
    } 
    public void setID(int newcusID)
    {
        cusID = newcusID;
    }

    public void setAccount(int newbankAcc)
    {
        bankAcc=newbankAcc;
    }


    
}