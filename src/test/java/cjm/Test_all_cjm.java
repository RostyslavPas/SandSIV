package cjm;

import org.testng.annotations.Test;

public class Test_all_cjm {

    _CJM cjm = new _CJM();

    @Test

    public void Test_all_cjm(){

        cjm.login_page();
            System.out.println("login_page");

        // create, read, update, delete CJM
        cjm.open_cjm_page();
        cjm.create_cjm();
            System.out.println("create_cjm");
        cjm.display_cjm();
            System.out.println("display_cjm");
        cjm.open_cjm();
        cjm.update_cjm();
            System.out.println("update_cjm");
        cjm.delete_cjm();
            System.out.println("delete_cjm");

        // delete default CJM
        cjm.open_cjm();
        cjm.delete_default_cjm();
            System.out.println("delete_default_cjm");

        // create, read update TOUCHPOINT
        cjm.open_cjm_page();
        cjm.create_touchpoint();
            System.out.println("create_touchpoint");
        cjm.read_touchpoint();
            System.out.println("read_touchpoint");
        cjm.update_touchpoint();
            System.out.println("update_touchpoint");

        // delete TOUCHPOINT
        cjm.open_cjm_page();
        cjm.create_touchpoint();
        cjm.read_touchpoint();
        cjm.delete_touchpoint();
            System.out.println("delete_touchpoint");

        //add_survey_to TOUCHPOINT and delete
        cjm.open_cjm_page();
        cjm.create_touchpoint();
        cjm.assign_surveys();
            System.out.println("assign_surveys");
        cjm.delete_survey_into_touchpoint();
            System.out.println("delete_survey_into_touchpoint");

        //dashboard LINK
        cjm.open_cjm_page();
        cjm.create_touchpoint();
        cjm.dashboard_link();
            System.out.println("dashboard_link");

    }
}
