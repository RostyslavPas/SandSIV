package cjm;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class _CJM {

    String pageCJM = "https://gcp-st-activate.sandsiv.com/feedback/customer-journey";

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

}
