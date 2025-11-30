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
		// TODO Auto-generated constructor stub
	}

	@FindBy (xpath = "//i[@class='ace-icon fa fa-sync-alt']")WebElement admin_reset;
   
    
    

	public AdminReset adminResetClick() {
		admin_reset.click();
	  	   return this;
	     }
    
}
