package pages;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constant;
import utilities.FileUploadUtility;


public class ManageCategoryPage {

	public WebDriver driver;
	FileUploadUtility fileUploadeObj=new FileUploadUtility();

    
   
    public ManageCategoryPage(WebDriver driver) {
    	   // call parent constructor
        this.driver=driver;
        PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy (xpath = "//a[@onclick='click_button(1)']")WebElement new_category_btn;
    @FindBy(xpath = "//li[@id='134-selectable']")WebElement select_discount;
    @FindBy(xpath = "//input[@name='category']")WebElement enter_category;
    @FindBy(xpath = "//input[@id='main_img']")WebElement category_image_upload;
    @FindBy(xpath = "//button[@type='submit']")WebElement save_category_btn;
    @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement is_category_saved;
    
    public boolean isCategorySaved() {
		return is_category_saved.isDisplayed();
    }
    public ManageCategoryPage newCategoryBtn() {
    	new_category_btn.click();
 	   return this;
   
    }
    public ManageCategoryPage enterNewCategory(String new_category) {
    	enter_category.sendKeys(new_category);
 	   return this;
   
    }
    public ManageCategoryPage  newCategorySelectGroup() {
    	select_discount.click();
 		return this;
    }
 	  
   
    public ManageCategoryPage  newCategoryImageUpload() {
    	//category_image_upload.sendKeys("C:\\Users\\HP\\Downloads\\download (5)_imresizer.jpg"); // ← Selenium uploads your file here
    	fileUploadeObj.sendkeyForFileUpload(category_image_upload, Constant.IMAGEPATH);
    	return this;
    	}
   
    public ManageCategoryPage saveCategoryBtn() {
    	JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("window.scrollBy(0.1000)");
		executor.executeScript("arguments[0].click();",save_category_btn);
		save_category_btn.click();
		
 	   return this;
   
    }
}