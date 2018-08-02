package cjm;

import org.testng.annotations.Test;

public class Test_4_Delete_CJM {

    _CJM cjm = new _CJM();

    @Test
    public void test_4() {

        cjm.login_page();
        cjm.open_cjm_page();
        cjm.create_cjm();
        cjm.display_cjm();
        cjm.open_cjm();
        cjm.update_cjm();
        cjm.delete_cjm();

    }

}

