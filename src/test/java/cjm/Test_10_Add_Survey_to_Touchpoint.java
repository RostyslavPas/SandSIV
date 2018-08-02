package cjm;

import org.testng.annotations.Test;

public class Test_10_Add_Survey_to_Touchpoint {

    _CJM cjm = new _CJM();

    @Test
    public void test10(){

        cjm.login_page();
        cjm.open_cjm_page();
        cjm.create_touchpoint();
        cjm.assign_surveys();

    }
}

