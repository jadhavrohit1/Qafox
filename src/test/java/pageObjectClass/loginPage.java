package pageObjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends BasePage {
	
	// constructor invoke
	public loginPage(WebDriver driver)
	{
		super(driver);
	}
	
	// locators
	
	@FindBy(linkText="Login") WebElement loginlink;
	@FindBy(id="input-email") WebElement txt_Username;
	@FindBy(id="input-password") WebElement txt_Password;
	@FindBy(xpath="//*[@type='submit']") WebElement login_btn;

	
	//Action methods
	
	public void clickLogingLink()
	{
		loginlink.click();
	}
	
   public void setUsername(String email)
   {
	   txt_Username.sendKeys(email);
   }
	
	public void setPassword(String pass)
	{
		txt_Password.sendKeys(pass);
	}
	
	public void clickLoginBtn()
	{
		login_btn.click();
	}
	
	
}
