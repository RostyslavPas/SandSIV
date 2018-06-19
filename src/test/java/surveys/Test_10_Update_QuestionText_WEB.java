package surveys;

import enterprise.Enterprise;
import org.testng.annotations.Test;

public class Test_10_Update_QuestionText_WEB {
    @Test
    public void update_questionText_web(){
        //login page https://gcp-st-activate.sandsiv.com login password

        Enterprise enterprise = new Enterprise();
        enterprise.st_activate_login();
    }
}
