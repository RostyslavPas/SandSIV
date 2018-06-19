package surveys;

import enterprise.Enterprise;
import org.testng.annotations.Test;

public class Test_13_Update_QuestionText_DIGI {
    @Test
    public void update_questionText_digi(){
        //login page https://gcp-st-activate.sandsiv.com login password

        Enterprise enterprise = new Enterprise();
        enterprise.st_activate_login();
    }
}
