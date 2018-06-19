package surveys;

import enterprise.Enterprise;
import org.testng.annotations.Test;

public class Test_15_Delete_QuestionText_SMS {
    @Test
    public void delete_questionText_sms(){
        //login page https://gcp-st-activate.sandsiv.com login password

        Enterprise enterprise = new Enterprise();
        enterprise.st_activate_login();
    }
}
