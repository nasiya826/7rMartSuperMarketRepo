package testscript;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constants.Constant;
import pages.LoginPage;
import utilities.FakerUtility;
import pages.AdminUserPage;
import pages.HomePage;

public class AdminPageTest extends Base {
	FakerUtility fake=new FakerUtility();
	
	HomePage home;
	AdminUserPage admin;
	@Test(retryAnalyzer = retry.Retry.class)
	@Parameters({"username","password"})
	public void newUser(String username,String password) {
		LoginPage loginObj=new LoginPage(driver);
		loginObj.userNameAndPassword(username, password);
		home = loginObj.btn_signin();
		admin=home.adminMore();
		admin.adminClick().newUserAdmin(fake.getUserName(), fake.getPassword()).newUserDropDown().newUserSaveBtn();
		boolean adminIsSaved=admin.isAdminSaved();
		  Assert.assertTrue(adminIsSaved,Constant.MAINERRORMESSAGE);

		/*
	 	loginObj.btn_signin();
	 
		AdminUserPage newUserObj=new AdminUserPage(driver);
		newUserObj.adminMore();
		newUserObj.adminClick();
		newUserObj.newUser(new_UserName, new_Password);
		newUserObj.newUserDropDownAndSaveBtn();
		
		*/
	}
}