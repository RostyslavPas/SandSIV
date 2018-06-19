package surveys;

import enterprise.Enterprise;
import org.testng.annotations.Test;

public class Test_18_Add_Multi_Question {
    @Test
    public void add_multi_question(){
        //login page https://gcp-st-activate.sandsiv.com login password

        Enterprise enterprise = new Enterprise();
        enterprise.st_activate_login();
    }
}
