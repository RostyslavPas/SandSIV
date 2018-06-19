package surveys;

import enterprise.Enterprise;
import org.testng.annotations.Test;

public class Test_20_Remove_Questionnaire {
    @Test
    public void remove_questionnaire(){
        //login page https://gcp-st-activate.sandsiv.com login password

        Enterprise enterprise = new Enterprise();
        enterprise.st_activate_login();
    }
}
