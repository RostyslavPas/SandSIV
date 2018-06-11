package enterprise;

import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Enterprise {


    @Test

    public void st_activate_login(){

        String pageSt = "enterprise";
        open(pageSt);

        SelenideElement loginUserSt = $("#username");
        String nameSt = "login";
        loginUserSt.setValue(nameSt);

        SelenideElement passwordUserSt = $("#password");
        String passwordSt = "password";
        passwordUserSt.setValue(passwordSt);

        SelenideElement btnLoginSt = $("#_submit");
        btnLoginSt.click();






        //test

    }

}
