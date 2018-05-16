package cjm;

import enterprise.Enterprise;
import org.testng.annotations.Test;
import java.text.SimpleDateFormat;
import java.util.Date;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class Test_3_Update_CJM {

    @Test
    public void test_3(){

        //login page https://st-activate.sandsiv.com login password

        Enterprise enterprise = new Enterprise();
        enterprise.st_activate_login();

        //open tab customer journey map

        CJM cjm = new CJM();
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
                format.format(date);

        cjm.nameCjmSelector.setValue(
                cjm_name_create);
        cjm.cjmSaveBtn.click();

        //display customer journey map after created

        cjm.listCjm.get(0).shouldHave(
                text(cjm_name_create));

        //open customer journey map and update cjm

        cjm.listCjm.get(0).click();
        String cjm_name_update =
                cjm.text_cjmUpdate + format.format(date);
        cjm.nameCjmSelector.setValue(
                cjm_name_update);
        cjm.cjmSaveBtn.click();
        cjm.alertSelector.shouldHave(
                text(cjm.update_cjm_text_alert));
    }
}
