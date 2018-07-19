package surveys;

import enterprise.Enterprise;
import org.junit.After;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.clearBrowserCookies;

public class Test_35_Delete_Question_DIGI {
    @Test
    public void delete_question_digi(){
        //login page https://gcp-st-activate.sandsiv.com login password

        Enterprise enterprise = new Enterprise();
        enterprise.st_activate_login();


        clearBrowserCookies();
    }
}
