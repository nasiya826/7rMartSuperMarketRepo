package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constants.Constant;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;
public class LoginPageTest extends Base{
	HomePage home;//globally declaire
  @Test(groups = "Smoke")
  public void loginPage() throws IOException {
	  LoginPage login= new LoginPage(driver);
	  String username=ExcelUtility.readStringData(1, 0, "LoginPageTest");
	  String password=ExcelUtility.readStringData(1, 1, "LoginPageTest");
	  login.userNameAndPassword(username,password);
	  home=login.btn_signin();
	  boolean dashboardDisplayed=login.isDashboardDisplayed();
	  Assert.assertTrue(dashboardDisplayed,Constant.ERRORMESSAGE);
  }                      //true,             false message from Constant class
  
	  @Test
	  @Parameters({"username","password"})
	  public void invalidUsernameAndValidPassword(String username,String password){
		 LoginPage login=new LoginPage(driver);
		 login.userNameAndPassword(username,password);
		 login.btn_signin();
		 
	  }
	  @Test(dataProvider = "Credentials",groups = "Smoke")
	  public void invalidUsernameAndPassword(String username,String password) {
		  LoginPage login=new LoginPage(driver);
			 login.userNameAndPassword(username,password);
			 login.btn_signin(); 
	  }
	  @DataProvider(name="Credentials")
	  public Object[][] testData(){
		  Object data[][]= {{"Nasiya","2004"},{"Jimin","1995"}};
		  
		return data;
		  
	  }
	  
}