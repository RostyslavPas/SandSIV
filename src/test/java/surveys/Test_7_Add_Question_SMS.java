package surveys;

import enterprise.Enterprise;
import org.testng.annotations.Test;

public class Test_7_Add_Question_SMS {
    @Test
    public void add_questions_sms(){
        //login page https://gcp-st-activate.sandsiv.com login password

        Enterprise enterprise = new Enterprise();
        enterprise.st_activate_login();
    }
}
