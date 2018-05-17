package cjm;

import enterprise.Enterprise;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import java.text.SimpleDateFormat;
import java.util.Date;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class Test_2_Read_CJM {
    @Test
    public void test_2(){

        //login page https://gcp-st-activate.sandsiv.com login password

        Enterprise enterprise = new Enterprise();
        enterprise.st_activate_login();

        //open tab customer journey map

        _CJM cjm = new _CJM();
        open(cjm.pageCJM);
            sleep(5000);

        //create customer journey map

        cjm.manage_customer_journey.click();
            sleep(2000);
        cjm.btn_add_customer_journey.click();
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat(
                cjm.dateFormat);
        String cjm_name_create = cjm.nameCJM +
                format.format(
                        date);

        cjm.nameCjmSelector.setValue(
                cjm_name_create);
        cjm.cjmSaveBtn.click();

        //display customer journey map after created

        cjm.listCjm.get(0).shouldHave(
                text(cjm_name_create));
    }

}
