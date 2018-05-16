package enterprise;

import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Enterprise {


    @Test

    public void st_activate_login(){

        String pageSt = "https://gcp-st-activate.sandsiv.com/login";
        open(pageSt);

        SelenideElement loginUserSt = $("#username");
        String nameSt = "rostislav.pas@sandsiv.com";
        loginUserSt.setValue(nameSt);

        SelenideElement passwordUserSt = $("#password");
        String passwordSt = "Ros_0632059555_sandsiv";
        passwordUserSt.setValue(passwordSt);

        SelenideElement btnLoginSt = $("#_submit");
        btnLoginSt.click();

    }

}
