package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class AdminReset {

	public WebDriver driver;
	PageUtility pageUtilityObj =new PageUtility();

    
        
   
    public AdminReset(WebDriver driver) {
    	 // call parent constructor
        this.driver=driver;
        PageFactory.initElements(driver, this);
		// to initialize the web elements
	}

	@FindBy (xpath = "//i[@class='ace-icon fa fa-sync-alt']")WebElement admin_reset;
	@FindBy(xpath="//div[@class='col-sm-6']")WebElement is_admin_reset;
	
    
    
//used chaines to connect the methodes
	public AdminReset adminResetClick() {
		admin_reset.click();
	  	   return this;
	     }
	
	public boolean isResetDone() {
		return is_admin_reset.isDisplayed();
	    
	}
	}



	
    

