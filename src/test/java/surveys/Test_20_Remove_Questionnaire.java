package surveys;

import enterprise.Enterprise;
import org.junit.After;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.clearBrowserCookies;

public class Test_20_Remove_Questionnaire {
    @Test
    public void remove_questionnaire(){
        //login page https://gcp-st-activate.sandsiv.com login password

        Enterprise enterprise = new Enterprise();
        enterprise.st_activate_login();


        clearBrowserCookies();
    }
}
