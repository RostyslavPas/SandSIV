package cjm;

import org.testng.annotations.Test;

public class Test_8_Update_Touchpoint {

    _CJM cjm = new _CJM();

    @Test
    public void test8(){

        cjm.login_page();
        cjm.open_cjm_page();
        cjm.create_touchpoint();
        cjm.read_touchpoint();
        cjm.update_touchpoint();

    }
}
