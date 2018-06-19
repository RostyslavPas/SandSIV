package surveys;

import enterprise.Enterprise;
import org.testng.annotations.Test;

public class Test_29_Response_Rate {
    @Test
    public void response_rate(){
        //login page https://gcp-st-activate.sandsiv.com login password

        Enterprise enterprise = new Enterprise();
        enterprise.st_activate_login();
    }
}
