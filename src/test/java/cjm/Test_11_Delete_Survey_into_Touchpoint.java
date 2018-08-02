package cjm;

import org.testng.annotations.Test;

public class Test_11_Delete_Survey_into_Touchpoint {

    _CJM cjm = new _CJM();

    @Test
    public void test11(){

        cjm.login_page();
        cjm.open_cjm_page();
        cjm.create_touchpoint();
        cjm.assign_surveys();
        cjm.delete_survey_into_touchpoint();

    }
}
