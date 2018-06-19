package surveys;

import enterprise.Enterprise;
import org.testng.annotations.Test;

public class Test_8_Add_Question_IVR {
    @Test
    public void add_questions_ivr(){
        //login page https://gcp-st-activate.sandsiv.com login password

        Enterprise enterprise = new Enterprise();
        enterprise.st_activate_login();
    }
}
