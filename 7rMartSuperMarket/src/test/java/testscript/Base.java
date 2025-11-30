package testscript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import constants.Constant;
import utilities.ScreenShotUtility;

public class Base{
	WebDriver driver;
	public Properties properties;
	public FileInputStream fis;
	@BeforeMethod(alwaysRun = true)//to execute properly we use true
	@Parameters("Browser")
	public void beforMethod(String browser) throws Exception {
		//driver=new ChromeDriver();
		try {
			properties = new Properties();
			fis = new FileInputStream(Constant.CONFIGFILE);
			properties.load(fis);

		} catch (FileNotFoundException exception) {
			exception.printStackTrace();
		}
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			throw new Exception("invalid browser");
		}
		driver.get(properties.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//applyat all class element
		driver.manage().window().maximize();
		
	}
	@AfterMethod(alwaysRun = true)
	public void afterMethode(ITestResult itResult) throws IOException{
	if (itResult.getStatus() == ITestResult.FAILURE) {
		ScreenShotUtility sc = new ScreenShotUtility();
		sc.captureFailureScreenShot(driver, itResult.getName());
	}
	if (driver != null) {
		driver.quit();
	}
	}
	
}
