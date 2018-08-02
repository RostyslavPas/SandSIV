package cjm;

import org.testng.annotations.Test;

public class Test_6_Create_Touchpoint {

    _CJM cjm = new _CJM();

    @Test
    public void test6(){

        cjm.login_page();
        cjm.open_cjm_page();
        cjm.create_touchpoint();

    }
}
