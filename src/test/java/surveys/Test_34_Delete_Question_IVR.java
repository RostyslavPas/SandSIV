package surveys;

import enterprise.Enterprise;
import org.junit.After;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.clearBrowserCookies;

public class Test_34_Delete_Question_IVR {
    @Test
    public void delete_question_ivr(){
        //login page https://gcp-st-activate.sandsiv.com login password

        Enterprise enterprise = new Enterprise();
        enterprise.st_activate_login();


        clearBrowserCookies();
    }
}
