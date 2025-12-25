package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	//constructor - //We are expecting driver from base class
	
	protected WebDriver driver;
	
	protected WebDriverWait wait;
	
	protected BasePage(WebDriver driver)
	{	
		this.driver=driver;
		PageFactory.initElements(driver, this);		
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
	}

}
