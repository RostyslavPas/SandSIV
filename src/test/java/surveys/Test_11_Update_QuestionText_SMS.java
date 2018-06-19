package surveys;

import enterprise.Enterprise;
import org.testng.annotations.Test;

public class Test_11_Update_QuestionText_SMS {
    @Test
    public void update_quetionText_sms(){
        //login page https://gcp-st-activate.sandsiv.com login password

        Enterprise enterprise = new Enterprise();
        enterprise.st_activate_login();
    }
}
