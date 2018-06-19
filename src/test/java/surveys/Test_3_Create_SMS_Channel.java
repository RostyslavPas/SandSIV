package surveys;

import enterprise.Enterprise;
import org.testng.annotations.Test;

public class Test_3_Create_SMS_Channel {
    @Test
    public void create_sms_channel(){
        //login page https://gcp-st-activate.sandsiv.com login password

        Enterprise enterprise = new Enterprise();
        enterprise.st_activate_login();
    }
}
