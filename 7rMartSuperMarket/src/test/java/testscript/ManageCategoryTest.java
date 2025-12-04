package testscript;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constants.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageCategoryPage;


public class ManageCategoryTest extends Base{
	
			HomePage home;
			ManageCategoryPage category;
			
			
			
			@Test
			@Parameters({"username","password","new_category"})
			public void newCategoryMethode(String username,String password,String new_category ) {
				
				
				LoginPage loginObj=new LoginPage(driver);
				loginObj.userNameAndPassword(username, password);
				home = loginObj.btn_signin();
				category=home.manageCategory();
				category.newCategoryBtn()
			     .enterNewCategory(new_category)
			     .newCategorySelectGroup().newCategoryImageUpload().saveCategoryBtn();
				boolean categoryIsSaved=category.isCategorySaved();
				  Assert.assertTrue(categoryIsSaved,Constant.MAINERRORMESSAGE);
				
			}
		}