package surveys;

import enterprise.Enterprise;
import org.testng.annotations.Test;

public class Test_33_Delete_Question_SMS {
    @Test
    public void delete_question_sms(){
        //login page https://gcp-st-activate.sandsiv.com login password

        Enterprise enterprise = new Enterprise();
        enterprise.st_activate_login();
    }
}
