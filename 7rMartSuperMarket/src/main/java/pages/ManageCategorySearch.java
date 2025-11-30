package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageCategorySearch {
	

		public WebDriver driver;
	    
	   
	    public ManageCategorySearch(WebDriver driver) {
	    	   // call parent constructor
	        this.driver=driver;
	        PageFactory.initElements(driver, this);
			// TODO Auto-generated constructor stub
		}

		@FindBy(xpath = "//a[@onclick='click_button(2)']")WebElement category_search_click;
	    @FindBy(xpath = "//input[@class='form-control']")WebElement category_box;
	    @FindBy(xpath = "//button[@class='btn btn-danger btn-fix']")WebElement search_btn;
	    @FindBy(xpath="//span[@id='res']")WebElement categorysearch_errormessage;
	    
	    /*public boolean isCategoryFound() {
			return categorysearch_errormessage.isDisplayed();
	    }*/
	    public ManageCategorySearch searchCategoryBtn() {
	    	category_search_click.click();
	 	   return this;
	   
	    }
	    public ManageCategorySearch enterCategory(String category) {
	    	category_box.sendKeys(category);
	 	   return this;
	   
	    }
	    public ManageCategorySearch  searchCategory() {
	    	search_btn.click();
	 		return this;
	    }
	 	  
	   
	   
	   
	  /*  public ManageCategoryPage saveCategoryBtn() {
	    	JavascriptExecutor executor=(JavascriptExecutor) driver;
			executor.executeScript("window.scrollBy(0.1000)");
			executor.executeScript("arguments[0].click();",save_category_btn);
			save_category_btn.click();
			
	 	   return this; 
	 	   } */
	   
	    }
	

