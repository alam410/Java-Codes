
public class Static {
    public static void main(String[] args){
        Student s1= new Student();
        s1.setSchoolname("Bhola A.Rob School");
        System.out.println(s1.get_schoolname());

        Student s2 = new Student();
        System.out.println(s2.get_schoolname());
    }
}
class Student{

    static int returnAvg(int phy,int che,int math){   //but as everyone will get different numbers that's why argument is different
        //as everage policy would be same for everyone that's why it's static
        return (phy+che+math)/3;
    }
    String name;
    int roll;
    static String schoolname;  //As school name is same for everyone that's why it's static
    //if any of the object changes the school name then it will be changed for everyone
    //or if someone set a school name then everyone will get the same school name
    void setSchoolname(String schoolname){
        this.schoolname=schoolname;
    }
    String get_schoolname(){
        return schoolname;
    }

}
