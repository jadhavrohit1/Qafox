package pageObjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends BasePage {
	
	
	//constructor  - //We are expecting driver from basepage class
	

	public Homepage(WebDriver driver)  
	{
		super(driver);
	}
	
	
    //@findby - Find locator and save it in a variable
	
	@FindBy(xpath="//*[@title='My Account']") WebElement mAcc;
	@FindBy(linkText = "Register")            WebElement regLink;
	

	
	//Action methods
	
	public void clickMyAcc()
	{
		mAcc.click();
	}
	
	public void clickRegister()
	{
		regLink.click();
	}
	

}
