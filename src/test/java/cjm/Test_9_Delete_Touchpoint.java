package cjm;

import org.testng.annotations.Test;

public class Test_9_Delete_Touchpoint {

    _CJM cjm = new _CJM();

    @Test
    public void test9(){

        cjm.login_page();
        cjm.open_cjm_page();
        cjm.create_touchpoint();
        cjm.read_touchpoint();
        cjm.delete_touchpoint();

    }
}
