 package utilities;//5 methodes

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	public void selectByVisibleText(WebElement element,String text) {
		Select textvalue =new Select(element);
		textvalue.selectByVisibleText("Admin");
	}
	 public void selectByValue(WebElement element, String value) {
	        Select select = new Select(element);
	        select.selectByValue(value);
	    }

	    /** Select dropdown by index */
	    public void selectByIndex(WebElement element, int index) {
	        Select select = new Select(element);
	        select.selectByIndex(index);
	    }
	    public void enterText(WebElement element, String text) {
	        element.clear();
	        element.sendKeys(text);
	    }


	
}