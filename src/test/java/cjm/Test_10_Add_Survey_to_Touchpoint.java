package cjm;

import com.codeborne.selenide.SelenideElement;
import enterprise.Enterprise;
import org.junit.After;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class Test_10_Add_Survey_to_Touchpoint {

    @Test
    public void test10(){

        //login page https://gcp-st-activate.sandsiv.com login password

        Enterprise enterprise = new Enterprise();
        enterprise.st_activate_login();

        //open tab customer journey map

        _CJM cjm = new _CJM();
        open(cjm.pageCJM);
        sleep(5000);

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

        //assign surveys

        cjm.listTouchPoint.findBy(
                text(touch_point_text_name)).shouldBe(visible);
        ArrayList<SelenideElement> list =
                new ArrayList<com.codeborne.selenide.SelenideElement>(
                        cjm.listTouchPoint);
        System.out.println(list.size());

        int i = list.size();

        cjm.assignSurveys.get(i-2).click();
        sleep(3000);

        cjm.modalTitleAddTouchPoint.shouldHave(
                text(cjm.add_survey_into_touchpoint));

        cjm.selectPlaceholderAddSurvey.click();
        cjm.selectSurvey.click();
        cjm.saveSurveyIntoTouchpointBtn.click();

        cjm.alertSelector.shouldHave(
                text(cjm.add_survey_into_touchpoint_text_alert));



        close();
    }
}

