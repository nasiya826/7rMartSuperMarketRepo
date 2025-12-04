package testscript;

import org.testng.annotations.Test;

import constants.Constant;

import org.testng.Assert;
import org.testng.annotations.Parameters;

import pages.AdminReset;
import pages.HomePage;
import pages.LoginPage;

public class AdminResetTest extends Base {
    HomePage home;
    AdminReset reset;

    @Test
    @Parameters({"username","password"})
    public void newUser(String username, String password) {
        LoginPage loginObj = new LoginPage(driver);
        loginObj.userNameAndPassword(username, password);
        home = loginObj.btn_signin();
        reset = home.adminReset();
        reset.adminResetClick();
        boolean isFoundSaved=reset.isResetDone();
		  Assert.assertTrue(isFoundSaved,Constant.SEARCHISSUCCEFUL);
    }
}
