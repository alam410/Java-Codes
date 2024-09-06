public class Access_Modifiers {
    public static void main(String[] args){
        BankAccount myAcc = new BankAccount();
        myAcc.username="alam410";
        myAcc.setPassword("22234103410");

    }
}
class BankAccount{
   public String username;
   private String password;

   public void setPassword(String pwd){
       password = pwd;
   }
}
