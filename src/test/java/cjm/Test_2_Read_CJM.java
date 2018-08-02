package cjm;

import org.testng.annotations.Test;

public class Test_2_Read_CJM {

    _CJM cjm = new _CJM();

    @Test
    public void test_2(){

        cjm.login_page();
        cjm.open_cjm_page();
        cjm.create_cjm();
        cjm.display_cjm();

    }
}
