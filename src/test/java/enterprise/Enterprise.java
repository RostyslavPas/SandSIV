package enterprise;

import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import security.Security;

public class Enterprise {


    @Test

    public void st_activate_login(){

        Security security = new Security();

        String pageSt = security.pageSecurity;
            open(pageSt);

        SelenideElement loginUserSt = $("#username");
        String nameSt = security.loginSecurity;
            loginUserSt.setValue(nameSt);

        SelenideElement passwordUserSt = $("#password");
        String passwordSt = security.passwordSecurity;
            passwordUserSt.setValue(passwordSt);

        SelenideElement btnLoginSt = $("#_submit");
            btnLoginSt.click();

    }

}
