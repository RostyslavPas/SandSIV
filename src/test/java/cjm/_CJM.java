package cjm;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import enterprise.Enterprise;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.sleep;

public class _CJM {
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
    public void display_cjm(){
        _CJM cjm = new _CJM();
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat(
                cjm.dateFormat);
        String cjm_name_create = cjm.nameCJM +
                format.format(
                        date);
        cjm.listCjm.get(0).shouldHave(
                text(cjm_name_create));
    }
    public void open_cjm(){
        _CJM cjm = new _CJM();
        cjm.listCjm.get(0).click();

    }
    public void update_cjm(){
        _CJM cjm = new _CJM();
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat(
                cjm.dateFormat);
        String cjm_name_update =
                cjm.text_cjmUpdate + format.format(
                        date);
        cjm.nameCjmSelector.setValue(
                cjm_name_update);
        cjm.cjmSaveBtn.click();
        cjm.alertSelector.shouldHave(
                text(cjm.update_cjm_text_alert));
    }
    public void delete_cjm(){
        _CJM cjm = new _CJM();
        cjm.cjmDeleteBtn.get(0).click();
        switchTo().alert().accept();
        cjm.alertsSelectors.get(1).shouldHave(
                text(cjm.delete_cjm_text_alert));
    }
    public void delete_default_cjm(){
        _CJM cjm = new _CJM();
        sleep(2000);
        cjm.cjmDefaultBtnDelete.shouldNotBe(visible);
    }
    public void create_touchpoint(){
        _CJM cjm = new _CJM();
        //count_of_list_customer_journey

        cjm.manage_customer_journey.click();
        sleep(2000);
        cjm.cjm_list.findBy(
                text(cjm.defaulCustomerJourney));
        ArrayList list = new ArrayList(
                cjm.cjm_list);
        System.out.println("Count of Customer Journey " + list.size());
        int list_cjm = list.size();
        cjm.close_manage_cjm_windows.click();
        sleep(3000);

        //create new touchpoint

        cjm.addTouchpointBtn.get(1).click();
        cjm.modalTitleAddTouchPoint.shouldHave(
                text(cjm.title_touch_point));

        sleep(3000);

        Date date = new Date();
        SimpleDateFormat format =
                new SimpleDateFormat(cjm.dateFormat);

        String touch_point_text_name =
                cjm.defaultToucpointName + format.format(date);
        cjm.touchpointNameSelector.setValue(
                touch_point_text_name);

        //select a cjm in popup

        if (list_cjm == 1){
            cjm.touchPointDropdownCjm.click();
            cjm.touchPointSelectCjm.click();
        }
        if (list_cjm > 1){
            cjm.touchpointNameSelector.sendKeys(
                    Keys.TAB,
                    Keys.ARROW_UP,
                    Keys.ARROW_UP,
                    Keys.ENTER);
        }

        //fill in the field Dashboard Link

        cjm.dashboardLink.setValue(
                cjm.touch_poit_url);
        cjm.addBtn.click();
        cjm.alertSelector.shouldHave(
                text(cjm.add_touchpoint_text_alert));
    }
    public void read_touchpoint(){
        _CJM cjm = new _CJM();
        //read touch point, show settings

        Date date = new Date();
        SimpleDateFormat format =
                new SimpleDateFormat(cjm.dateFormat);
        String touch_point_text_name =
                cjm.defaultToucpointName + format.format(date);


        cjm.listTouchPoint.findBy(
                text(touch_point_text_name)).shouldBe(visible);
        ArrayList<com.codeborne.selenide.SelenideElement> list1 =
                new ArrayList<com.codeborne.selenide.SelenideElement>(
                        cjm.listTouchPoint);
        System.out.println("Count of Touchpoint " + list1.size());

        int list_touchpoint = list1.size();

        cjm.settingTouchPoint.get(list_touchpoint-2).click();
        cjm.modalTitleAddTouchPoint.shouldHave(
                text(cjm.edit_touch_point_text));

        sleep(3000);

        cjm.touchPointBtnCancel.shouldBe(exist);
        cjm.touchPointBtnRemove.shouldBe(visible);
        cjm.addBtn.shouldBe(visible);
    }
    public void update_touchpoint(){
        //update touch point
        _CJM cjm = new _CJM();
        cjm.touchpointNameSelector.setValue(
                cjm.new_name_touchpoint_after_update);
        cjm.touchPointBtnSave.get(1).click();
        cjm.alertSelector.shouldHave(
                text(cjm.update_touchpoint_text_alert));
    }
    public void delete_touchpoint(){

        _CJM cjm = new _CJM();
        //delete TouchPoint

        Date date = new Date();
        SimpleDateFormat format =
                new SimpleDateFormat(cjm.dateFormat);
        String touch_point_text_name =
                cjm.defaultToucpointName + format.format(date);

        cjm.touchPointBtnRemove.click();
        sleep(3000);
        switchTo().alert().accept();
        sleep(3000);

        cjm.listTouchPoint.findBy(
                text(touch_point_text_name)).shouldNot(visible);
    }
    public void assign_surveys(){

        _CJM cjm = new _CJM();
        //assign surveys

        Date date = new Date();
        SimpleDateFormat format =
                new SimpleDateFormat(cjm.dateFormat);
        String touch_point_text_name =
                cjm.defaultToucpointName + format.format(date);

        cjm.listTouchPoint.findBy(
                text(touch_point_text_name)).shouldBe(visible);
        ArrayList<SelenideElement> list =
                new ArrayList<com.codeborne.selenide.SelenideElement>(
                        cjm.listTouchPoint);
        System.out.println("Count of Touchpoint " + list.size());

        int list_touchpoint = list.size();

        cjm.assignSurveys.get(list_touchpoint-2).click();
        sleep(3000);

        cjm.modalTitleAddTouchPoint.shouldHave(
                text(cjm.add_survey_into_touchpoint));

        cjm.selectPlaceholderAddSurvey.click();
        cjm.selectSurvey.click();
        cjm.saveSurveyIntoTouchpointBtn.click();

        cjm.alertSelector.shouldHave(
                text(cjm.add_survey_into_touchpoint_text_alert));
    }
    public void delete_survey_into_touchpoint(){

        _CJM cjm = new _CJM();
        //assign surveys

        Date date = new Date();
        SimpleDateFormat format =
                new SimpleDateFormat(cjm.dateFormat);
        String touch_point_text_name =
                cjm.defaultToucpointName + format.format(date);

        cjm.listTouchPoint.findBy(
                text(touch_point_text_name)).shouldBe(visible);
        ArrayList<SelenideElement> list =
                new ArrayList<com.codeborne.selenide.SelenideElement>(
                        cjm.listTouchPoint);
        System.out.println("Count of Touchpoint " + list.size());

        int list_touchpoint = list.size();

        cjm.assignSurveys.get(list_touchpoint-2).click();
        sleep(3000);

        cjm.modalTitleAddTouchPoint.shouldHave(
                text(cjm.add_survey_into_touchpoint));

        cjm.deleteSurveyIntoTouchpoint.click();
        cjm.saveSurveyIntoTouchpointBtn.click();

        cjm.alertSelector.shouldHave(
                text(cjm.delete_survey_into_touchpoint_text_alert));
    }

    String pageCJM = "https://gcp-st-activate.sandsiv.com/feedback/customer-journey";
//    String pageCJM = "https://vchub.sandsiv.com/feedback/customer-journey";

    SelenideElement manage_customer_journey =
            $(".pull-left.openManageProjects.glyphicon.glyphicon-cog");
    SelenideElement btn_add_customer_journey =
            $(By.xpath("html/body/div[6]/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div/button"));
    String dateFormat = "dd.MM.yyyy_HH:mm";
    String nameCJM = "test_customer_journey_map::";
    SelenideElement nameCjmSelector = $(".form-control");
    SelenideElement cjmSaveBtn =
            $(By.xpath("html/body/div[6]/div[2]/div/div/div[3]/div/div/div[1]/div/div/div/span/span[2]/button"));

    ElementsCollection listCjm = $$(".list-group-item");

    String text_cjmUpdate = "test_customer_journey_map_update::";
    String update_cjm_text_alert = "Customer Journey was updated successfully!";
    SelenideElement alertSelector = $(".notification-element.notification-text>span");
    ElementsCollection cjmDeleteBtn = $$(".delete-button-project-modal.pointer.badge.pull-right");
    String delete_cjm_text_alert = "Customer Journey was removed successfully!";
    ElementsCollection alertsSelectors = $$(".notification-element.notification-text>span");
    SelenideElement cjmDefaultBtnDelete = $(".delete-button-project-modal.pointer.badge.pull-right.hidden");


    //Touchpoints elements

    SelenideElement close_manage_cjm_windows = $(".close");

    ElementsCollection cjm_list = $$(".delete-button-project-modal.pointer.badge.pull-right");
    String defaulCustomerJourney = "Default Customer Jourvey";

    String add_touchpoint_text_alert = "Touchpoint was added successfully!";
    String update_touchpoint_text_alert = "Touchpoint was updated successfully!";

    String add_survey_into_touchpoint_text_alert = "Surveys in touchpoint successfully updated";
    String delete_survey_into_touchpoint_text_alert= "Surveys from touchpoint successfully deleted";

    SelenideElement modalTitleAddTouchPoint = $(".modal-title");
    String title_touch_point = "Add Touchpoint";
    String defaultToucpointName = "new_touchpoint_cjm::";
    SelenideElement touchpointNameSelector = $("#touchpoint_name");
    SelenideElement touchPointDropdownCjm = $(".Select-placeholder");
    SelenideElement touchPointSelectCjm = $(By.xpath(".//*[@id='react-select-3--option-0']"));


    SelenideElement dashboardLink = $("#touchpoint_url");
    String touch_poit_url = "http://rostislav-pas.besaba.com/";

    ElementsCollection listTouchPoint = $$(".toggle-panel-title");
    ElementsCollection settingTouchPoint = $$(".touchpoint-actions-setting.btn.btn-default");

    ElementsCollection assignSurveys = $$(".touchpoint-actions-add.btn.btn-default");

    ElementsCollection dboardLink = $$(".btn.btn-default.touchpoint-actions-link");
    String edit_touch_point_text = "Edit Touchpoint";

    ElementsCollection addTouchpointBtn = $$(".btn.btn-default.pull-right");
    SelenideElement addBtn = $(".btn.btn-primary");
    ElementsCollection touchPointBtnSave = $$(".btn.btn-primary");
    SelenideElement touchPointBtnCancel = $(".btn.btn-default");
    SelenideElement touchPointBtnRemove = $(".btn.btn-danger");
    SelenideElement saveSurveyIntoTouchpointBtn = $(By.xpath("html/body/div[6]/div[2]/div/div/div[3]/div/button[2]"));


    String new_name_touchpoint_after_update = "new_name_touchpoint_after_update";

    String add_survey_into_touchpoint = "Add Survey into Touchpoint";
    SelenideElement selectPlaceholderAddSurvey = $(".Select-placeholder");
    SelenideElement selectPlaceholderAddSecondSurvey = $(".Select-arrow-zone");

    SelenideElement selectSurvey = $("#react-select-5--option-0");
    SelenideElement selectSecondSurvey = $("#react-select-11--option-1");
    SelenideElement deleteSurveyIntoTouchpoint = $(".Select-value-icon");

    String textTitle = "Gallery - List of product company";

}
