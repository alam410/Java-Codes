public class Task_03 {
    public  static void main(String[] args){
        Holiday a = new Holiday();
        a.setName("Saturday");
        System.out.println(a.getName());
        a.setDay(5);
        System.out.println(a.getDay());
        a.setMonth("February");
        System.out.println(a.getMonth());
    }
}
class Holiday{
    private String name;
    private int day;
    private String month;
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    void setDay(int day){
        this.day= day;
    }
    int getDay(){
        return day;
    }
    void setMonth(String month){
        this.month=month;
    }
    String getMonth(){
        return month;
    }
}
