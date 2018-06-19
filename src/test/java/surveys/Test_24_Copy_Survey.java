package surveys;

import enterprise.Enterprise;
import org.testng.annotations.Test;

public class Test_24_Copy_Survey {
    @Test
    public void copy_survey(){
        //login page https://gcp-st-activate.sandsiv.com login password

        Enterprise enterprise = new Enterprise();
        enterprise.st_activate_login();
    }
}
