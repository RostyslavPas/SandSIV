package cjm;

import enterprise.Enterprise;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class Test_5_Delete_Default_CJM {

    @Test
    public void test5(){

        //login page https://gcp-st-activate.sandsiv.com login password

        Enterprise enterprise = new Enterprise();
        enterprise.st_activate_login();

        //open tab customer journey map

        _CJM cjm = new _CJM();
        open(cjm.pageCJM);
        sleep(5000);

        //open customer journey and delete default cjm

        cjm.manage_customer_journey.click();
        sleep(2000);
        cjm.cjmDefaultBtnDelete.shouldNotBe(visible);
    }
}
