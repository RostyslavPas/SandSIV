package surveys;

import enterprise.Enterprise;
import org.testng.annotations.Test;

public class Test_22_Search_by_CustomerId {
    @Test
    public void search_by_customerId(){
        //login page https://gcp-st-activate.sandsiv.com login password

        Enterprise enterprise = new Enterprise();
        enterprise.st_activate_login();
    }
}
