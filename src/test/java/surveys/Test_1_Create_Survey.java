package surveys;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import enterprise.Enterprise;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.present;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Test_1_Create_Survey {
    @Test
    public void createSurvey(){

        //login page https://gcp-st-activate.sandsiv.com login password

        Enterprise enterprise = new Enterprise();
        enterprise.st_activate_login();

        //open tab survey_list_and_check_page_content

            SelenideElement xircl_feedback = $("#voc-feedback");
        xircl_feedback.click();

            ElementsCollection voc_feedback = $$(".dropdown-menu>li>a");
        voc_feedback.get(0).click();

        

        // Click_btn_add_survey_and_add_survey

            SelenideElement btn_add_survey = $(".btn.btn-default.pull-right");
        btn_add_survey.shouldBe(visible);
        btn_add_survey.click();

            SelenideElement dialog_window = $(".modal-content");
        dialog_window.shouldBe(visible);







    }
}
