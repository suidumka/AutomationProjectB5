package io.loop.test.day8;

import io.loop.test.Utilities.DocuportConstants;
import io.loop.test.Utilities.DocuportUtils;
import io.loop.test.base.TestBase;
import org.testng.annotations.Test;

public class T1_login_docuport extends TestBase {

    @Test
    public void loginDocuport() throws InterruptedException {
        DocuportUtils.login(driver, "client");
        DocuportUtils.logOut(driver);

    }


}

