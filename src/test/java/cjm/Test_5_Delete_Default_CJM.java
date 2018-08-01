package cjm;

import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;

public class Test_5_Delete_Default_CJM {

    _CJM cjm = new _CJM();

    @Test
    public void test5(){

        cjm.login_page();
        cjm.open_cjm_page();
        cjm.open_cjm();
        cjm.delete_default_cjm();
        close();
    }
}
