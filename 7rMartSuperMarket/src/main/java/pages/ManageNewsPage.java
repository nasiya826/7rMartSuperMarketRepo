package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
	
		public WebDriver driver;

	    public ManageNewsPage(WebDriver driver) {
	         // call parent constructor
	        this.driver=driver;
	        PageFactory.initElements(driver, this);
	    }
	   
	    @FindBy (xpath = "//a[@onclick='click_button(1)']")WebElement new_news_btn;
	    @FindBy(xpath = "//textarea[@placeholder='Enter the news']")WebElement enter_news;
	    @FindBy(xpath = "//button[@type='submit']")WebElement news_save_btn;
	    @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement news_saved;
	    
	    public boolean isNewsSaved() {
			return news_saved.isDisplayed();
	    }
	   
	    public ManageNewsPage newNews(String new_News) {
	    	enter_news.sendKeys(new_News);
	 	   
	 	   return this;
	    }
	    public ManageNewsPage newNewsSaveClick() {
	    	news_save_btn.click();
	    	System.out.println("ManageNewsPage");
	 	   return this;
	   
	    }
		public ManageNewsPage newNewsClick() {
			new_news_btn.click();
		 	   return this;
		    }
	}