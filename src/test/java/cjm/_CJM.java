package cjm;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import enterprise.Enterprise;
import org.openqa.selenium.By;

import java.text.SimpleDateFormat;
import java.util.Date;

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
