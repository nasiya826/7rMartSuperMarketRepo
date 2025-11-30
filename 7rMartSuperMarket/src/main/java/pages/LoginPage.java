package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;



public class LoginPage {
	public WebDriver driver;/*This declares a variable named driver of type WebDriver.
	WebDriver is the Selenium interface that controls the browser like Chrome, Firefox etc*/
	WaitUtility wait=new WaitUtility() ;
	public LoginPage (WebDriver driver) { //Constructor of class 
	
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath= "//input[@placeholder='Username']") WebElement username;
	@FindBy(xpath = "//input[@placeholder='Password']") WebElement password;
	@FindBy(xpath = "//button[@class='btn btn-dark btn-block']") WebElement signin_btn;
	@FindBy(xpath="(//a[@class='small-box-footer'])[2]")WebElement dashboard;
	
	public boolean isDashboardDisplayed() {
		return dashboard.isDisplayed();//check if dashboard is displayed
	}
	public LoginPage userNameAndPassword(String usernamefield,String passwordfield) {
		username.sendKeys(usernamefield);
		password.sendKeys(passwordfield);
		return this;
	}
	
	
	public HomePage btn_signin() {
	    
		
		wait.waitForElementClick(driver, signin_btn);
	    signin_btn.click();
	    
	    return new HomePage(driver);
	}
//be cause going to new page homepage
	}