package University.Department.Mypackage;
import University.*;
import University.Department.Goal;
import University.Department.Staff;

public class test34 {
    public static void main(String[] args){
        WelcomeMsg msg = new WelcomeMsg();
        msg.MSG();
        Goal ob1 = new Goal();
        ob1.goal();
        Staff st = new Staff();
        st.add_Student();
        st.remove_student();

    }
}
