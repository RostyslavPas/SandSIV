package surveys;

import enterprise.Enterprise;
import org.testng.annotations.Test;

public class Test_34_Delete_Question_IVR {
    @Test
    public void delete_question_ivr(){
        //login page https://gcp-st-activate.sandsiv.com login password

        Enterprise enterprise = new Enterprise();
        enterprise.st_activate_login();
    }
}
