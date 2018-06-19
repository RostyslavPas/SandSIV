package surveys;

import enterprise.Enterprise;
import org.testng.annotations.Test;

public class Test_14_Delete_QuestionText_WEB {
    @Test
    public void delete_questionText_web(){
        //login page https://gcp-st-activate.sandsiv.com login password

        Enterprise enterprise = new Enterprise();
        enterprise.st_activate_login();
    }
}
