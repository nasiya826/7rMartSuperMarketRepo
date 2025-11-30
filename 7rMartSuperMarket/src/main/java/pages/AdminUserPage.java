
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class AdminUserPage {
	public WebDriver driver;
	PageUtility pageUtilityObj =new PageUtility();

    
        
   
    public AdminUserPage(WebDriver driver) {
    	 // call parent constructor
        this.driver=driver;
        PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy (xpath = "//a[@class='btn btn-rounded btn-danger']")WebElement admin_new;
    @FindBy(xpath = "//input[@id='username']")WebElement new_user;
    @FindBy(xpath = "//input[@id='password']")WebElement new_password;
    @FindBy (xpath = "//select[@id='user_type']")WebElement user_Type;
    @FindBy(xpath = "(//button[@type='submit'])[2]")WebElement user_save_btn;
    @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement is_admin_saved;
    
   
    
    
    public AdminUserPage adminClick() {
 	   admin_new.click();
 	   return this;
    }
    public AdminUserPage newUserAdmin(String new_UserName,String new_Password) {
 	   new_user.sendKeys(new_UserName);
 	   new_password.sendKeys(new_Password);
 	   return this;
    }
    public AdminUserPage newUserDropDown() {
 	  // Select select=new Select(user_Type);
 		//select.selectByVisibleText("Admin");
 		pageUtilityObj.selectByVisibleText(user_Type,"Admin");
 		return this;
    }
    public AdminUserPage newUserSaveBtn() {
    	user_save_btn.click();
    	return this;
    }

	public boolean isAdminSaved() {
		return is_admin_saved.isDisplayed();
    
	}
     
}
