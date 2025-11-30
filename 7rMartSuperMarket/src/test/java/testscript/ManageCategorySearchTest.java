package testscript;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import pages.HomePage;
import pages.LoginPage;
import pages.ManageCategorySearch;

public class ManageCategorySearchTest extends Base{
	HomePage home;
	ManageCategorySearch categories;
	
	
	
	@Test
	@Parameters({"username","password","category"})
	public void newCategoryMethode(String username,String password,String category ) {
		
		
		LoginPage loginObj=new LoginPage(driver);
		loginObj.userNameAndPassword(username, password);
		home = loginObj.btn_signin();
		categories=home.manageSearchCategory();
		categories.searchCategoryBtn().enterCategory(category).searchCategory();
		/*boolean categoryIsSaved=categories.isCategoryFound();
		  Assert.assertTrue(categoryIsSaved,Constant.SEARCHISSUCCEFUL);*/
		
	}

}
