package surveys;

import enterprise.Enterprise;
import org.testng.annotations.Test;

public class Test_35_Delete_Question_DIGI {
    @Test
    public void delete_question_digi(){
        //login page https://gcp-st-activate.sandsiv.com login password

        Enterprise enterprise = new Enterprise();
        enterprise.st_activate_login();
    }
}
