package cjm;

import org.testng.annotations.Test;

public class Test_12_Dashboard_link_Touchpoint {

    _CJM cjm = new _CJM();

    @Test
    public void test12(){

        cjm.login_page();
        cjm.open_cjm_page();
        cjm.create_touchpoint();
        cjm.dashboard_link();

    }
}
