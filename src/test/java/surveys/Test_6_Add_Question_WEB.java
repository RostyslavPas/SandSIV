package surveys;

import enterprise.Enterprise;
import org.testng.annotations.Test;

public class Test_6_Add_Question_WEB {
    @Test
    public void add_questions_web(){
        //login page https://gcp-st-activate.sandsiv.com login password

        Enterprise enterprise = new Enterprise();
        enterprise.st_activate_login();
    }
}
