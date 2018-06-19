package surveys;

import enterprise.Enterprise;
import org.testng.annotations.Test;

public class Test_28_Change_Status_DIGI {
    @Test
    public void change_status_digi(){
        //login page https://gcp-st-activate.sandsiv.com login password

        Enterprise enterprise = new Enterprise();
        enterprise.st_activate_login();
    }
}
