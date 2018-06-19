package surveys;

import enterprise.Enterprise;
import org.testng.annotations.Test;

public class Test_23_Send_Invitation {
    @Test
    public void send_invitation(){
        //login page https://gcp-st-activate.sandsiv.com login password

        Enterprise enterprise = new Enterprise();
        enterprise.st_activate_login();
    }
}
