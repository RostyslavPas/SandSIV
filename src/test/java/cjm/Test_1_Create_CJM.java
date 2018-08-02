package cjm;

import org.testng.annotations.Test;

public class Test_1_Create_CJM {

    _CJM cjm = new _CJM();

    @Test
    public void test_1(){

        cjm.login_page();
        cjm.open_cjm_page();
        cjm.create_cjm();

    }
}
