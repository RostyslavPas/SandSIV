package surveys;

import enterprise.Enterprise;
import org.testng.annotations.Test;

public class Test_21_Search_by_Address {
    @Test
    public void search_by_address(){
        //login page https://gcp-st-activate.sandsiv.com login password

        Enterprise enterprise = new Enterprise();
        enterprise.st_activate_login();
    }
}
