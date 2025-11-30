package testscript;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import constants.Constant;
import pages.AdminUserSearch;
import pages.HomePage;
import pages.LoginPage;

public class AdminUserSearchTest extends Base{
	HomePage home;
	AdminUserSearch search;
	@Test(retryAnalyzer = retry.Retry.class)
	@Parameters({"username","password"})
	public void userSearch(String username,String password) {
		LoginPage loginObj=new LoginPage(driver);
		loginObj.userNameAndPassword(username, password);
		home = loginObj.btn_signin();
		search=home.adminSearch();
		search.adminSearchClick().adminSearch(username).userSaveBtn();
		boolean isFoundSaved=search.isFoundSaved();
		  Assert.assertTrue(isFoundSaved,Constant.SEARCHISSUCCEFUL);


	}}
