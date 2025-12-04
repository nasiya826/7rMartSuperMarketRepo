package testscript;

import org.testng.annotations.Test;

import constants.Constant;

import org.testng.Assert;
import org.testng.annotations.Parameters;


import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;

public class ManageNewsTest extends Base {
	
		HomePage home;
		ManageNewsPage news;
		
		@Test
		@Parameters({"username","password","new_News"})
		public void newNewsMethode(String username,String password,String new_News) {
			LoginPage loginObj=new LoginPage(driver);
			loginObj.userNameAndPassword(username, password);
			home = loginObj.btn_signin();
			news=home.manageNews();
			news.newNewsClick()
		     .newNews(new_News)
		     .newNewsSaveClick();
			boolean newsIsSaved=news.isNewsSaved();
			  Assert.assertTrue(newsIsSaved,Constant.MAINERRORMESSAGE);

			
		}
	}