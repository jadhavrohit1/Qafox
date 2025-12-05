package pageObjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	//constructor - //We are expecting driver from testbase class
	
	WebDriver driver;
	
	BasePage(WebDriver driver)
	{	
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	

}
