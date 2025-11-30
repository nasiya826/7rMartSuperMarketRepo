package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class HomePage  {
	public WebDriver driver;
	WaitUtility wait=new WaitUtility() ;
    public HomePage(WebDriver driver) {
         // call parent constructor
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
  
	@FindBy(xpath = "//a[@data-toggle='dropdown']") WebElement admin;
    @FindBy(xpath = "(//a[@class='dropdown-item'])[2]") WebElement logout;
    @FindBy (xpath = "(//a[@class='small-box-footer'])[1]") WebElement admin_more;
    @FindBy(xpath="(//a[@class='small-box-footer'])[7]") WebElement manage_news;
    @FindBy(xpath="(//a[@class='small-box-footer'])[9]") WebElement manage_category;
    @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement category_saved_mess;
   
    
    public AdminUserPage adminMore() {
        admin_more.click();
        return new AdminUserPage(driver);
    }
    
   
	public HomePage clickForAdmin() {
		admin.click();
	
		return this;//not going any page so return this
	}
	public HomePage clickForLogOut() {

		logout.click();
		return this;//not going any page so return this
	
	}  public ManageNewsPage manageNews() {
			wait.waitForElementClick(driver, manage_news);
		
			  manage_news.click();
			return new ManageNewsPage(driver);
		  }	
	
	public ManageCategoryPage manageCategory() {
		wait.waitForElementClick(driver, manage_category);
		manage_category.click();
		return new ManageCategoryPage(driver);
	}
	public ManageCategorySearch manageSearchCategory() {
		wait.waitForElementClick(driver, manage_category);
		manage_category.click();
		return new ManageCategorySearch (driver);
	}
	public AdminUserSearch adminSearch() {
		admin_more.click();
        return new AdminUserSearch(driver);
    }

	public AdminReset adminReset() {
		 admin_more.click();
	        return new AdminReset(driver);
	    }
}

	
	