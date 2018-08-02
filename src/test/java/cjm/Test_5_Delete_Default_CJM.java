package cjm;

import org.testng.annotations.Test;

public class Test_5_Delete_Default_CJM {

    _CJM cjm = new _CJM();

    @Test
    public void test5(){

        cjm.login_page();
        cjm.open_cjm_page();
        cjm.create_cjm();
        cjm.display_cjm();
        cjm.open_cjm();
        cjm.update_cjm();
        cjm.delete_default_cjm();

    }
}
