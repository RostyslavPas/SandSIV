package surveys;

import enterprise.Enterprise;
import org.testng.annotations.Test;

public class Test_19_Static_Survey_Link {
    @Test
    public void static_survey_link(){
        //login page https://gcp-st-activate.sandsiv.com login password

        Enterprise enterprise = new Enterprise();
        enterprise.st_activate_login();
    }
}
