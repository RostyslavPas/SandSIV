package surveys;

import enterprise.Enterprise;
import org.testng.annotations.Test;

public class Test_26_Change_Status_SMS {
    @Test
    public void change_status_sms(){
        //login page https://gcp-st-activate.sandsiv.com login password

        Enterprise enterprise = new Enterprise();
        enterprise.st_activate_login();
    }
}
