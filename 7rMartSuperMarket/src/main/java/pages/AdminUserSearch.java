package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class AdminUserSearch {
	
		public WebDriver driver;
		PageUtility pageUtilityObj =new PageUtility();

	    
	        
	   
	    public AdminUserSearch(WebDriver driver) {
	    	 // call parent constructor
	        this.driver=driver;
	        PageFactory.initElements(driver, this);
			// TODO Auto-generated constructor stub
		}

	   // @FindBy (xpath ="(//a[@class='small-box-footer'])[1]")WebElement admin;
	    @FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")WebElement admin_search;
	    @FindBy(xpath = "//input[@type='text']")WebElement admin_username;
	    @FindBy(xpath = "//select[@class='form-control']")WebElement admin_usertype;
	    @FindBy(xpath = "//button[@class='btn btn-block-sm btn-danger']")WebElement user_serchbtn;
	    @FindBy(xpath="//span[@id='res']")WebElement search_errormessage;
	   
	  
	   
	    
	  
	    public AdminUserSearch adminSearch(String userName ){
	    	admin_username.sendKeys(userName);
	 	   return this;
	    }
	    public AdminUserSearch userSearchDropDown() {
	 	  // Select select=new Select(user_Type);
	 		//select.selectByVisibleText("Admin");
	 		pageUtilityObj.selectByVisibleText(admin_usertype,"Admin");
	 		return this;
	    }
	    public AdminUserSearch userSaveBtn() {
	    	user_serchbtn.click();
	    	return this;
	    }

		public boolean isFoundSaved() {
			return search_errormessage.isDisplayed();
	    
		}
		public AdminUserSearch adminSearchClick() {
			admin_search.click();
		 	   return this;
		    }
	}


