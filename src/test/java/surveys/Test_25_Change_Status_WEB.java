package surveys;

import enterprise.Enterprise;
import org.junit.After;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.clearBrowserCookies;

public class Test_25_Change_Status_WEB {
    @Test
    public void change_status_web(){
        //login page https://gcp-st-activate.sandsiv.com login password

        Enterprise enterprise = new Enterprise();
        enterprise.st_activate_login();


        clearBrowserCookies();
    }
}
