package cjm;

import enterprise.Enterprise;
import org.testng.annotations.Test;
import java.text.SimpleDateFormat;
import java.util.Date;
import static com.codeborne.selenide.Selenide.*;

public class Test_1_Create_CJM {

    public void login_page(){
        Enterprise enterprise = new Enterprise();
        enterprise.st_activate_login();
    }
    public void open_cjm_page(){
        _CJM cjm = new _CJM();
        open(cjm.pageCJM);
        sleep(5000);
    }
    public void create_cjm(){
        _CJM cjm = new _CJM();
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
    }
    @Test
    public void test_1(){
        login_page();
        open_cjm_page();
        create_cjm();
        close();
    }
}
