package testscript;



import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import pages.HomePage;
import pages.LoginPage;

public class HomePageTest extends Base {
	HomePage home;
	@Test
	@Parameters({"username","password"})
	public void logOut(String username,String password) {
		LoginPage loginObj=new LoginPage(driver);
		loginObj.userNameAndPassword(username, password);
		home=loginObj.btn_signin();
		home.clickForAdmin().clickForLogOut();//return this method
		/*loginObj.btn_signin();
		HomePage homepageObj= new HomePage(driver);
		homepageObj.clickForAdmin();
		homepageObj.clickForLogOut();
		*/
		String expected=" Login | 7rmart supermarket1 ";
		String actual=driver.getTitle();
		Assert.assertEquals(actual, expected,"LogOutFails");
	}
	

}