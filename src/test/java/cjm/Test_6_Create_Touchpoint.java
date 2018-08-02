package cjm;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class Test_6_Create_Touchpoint {

    _CJM cjm = new _CJM();

    @Test
    public void test6(){

        cjm.login_page();
        cjm.open_cjm_page();

        cjm.manage_customer_journey.click();
        sleep(2000);
        cjm.cjm_list.findBy(
                text(
                        cjm.defaulCustomerJourney));
        ArrayList list = new ArrayList(
                cjm.cjm_list);
        System.out.println(list.size());
        int i = list.size();
        cjm.close_manage_cjm_windows.click();
        sleep(3000);

        if (i == 1){
            //create new touchpoint
            cjm.addTouchpointBtn.get(1).click();
            cjm.modalTitleAddTouchPoint.shouldHave(
                    text(cjm.title_touch_point));

            sleep(3000);

            Date date = new Date();
            SimpleDateFormat format = new SimpleDateFormat(
                    cjm.dateFormat);

            String touch_point_text_name =
                    cjm.defaultToucpointName + format.format(date);
            cjm.touchpointNameSelector.setValue(
                    touch_point_text_name);
            //select a cjm in popup
            cjm.touchPointDropdownCjm.click();
            cjm.touchPointSelectCjm.click();

            //fill in the field Dashboard Link

            cjm.dashboardLink.setValue(
                    cjm.touch_poit_url);
            cjm.addBtn.click();
            cjm.alertSelector.shouldHave(
                    text(cjm.add_touchpoint_text_alert));
            close();
        }
        if (i > 1){
            //create new touchpoint
            cjm.addTouchpointBtn.get(1).click();
            cjm.modalTitleAddTouchPoint.shouldHave(
                    text(cjm.title_touch_point));

            sleep(3000);

            Date date = new Date();
            SimpleDateFormat format = new SimpleDateFormat(
                    cjm.dateFormat);

            String touch_point_text_name =
                    cjm.defaultToucpointName + format.format(date);
            cjm.touchpointNameSelector.setValue(
                    touch_point_text_name);

            //select a cjm in popup

            cjm.touchpointNameSelector.sendKeys(
                    Keys.TAB,
                    Keys.ARROW_UP,
                    Keys.ARROW_UP,
                    Keys.ENTER);

            //fill in the field Dashboard Link

            cjm.dashboardLink.setValue(
                    cjm.touch_poit_url);
            cjm.addBtn.click();
            cjm.alertSelector.shouldHave(
                    text(cjm.add_touchpoint_text_alert));

            close();
        }

    }

}
