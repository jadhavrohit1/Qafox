package pageObjectClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage extends BasePage {
	
	// constructor invoke
	public loginPage(WebDriver driver)
	{
		super(driver);
	}
	
	// locators
	
	
	@FindBy(xpath="//*[@id='input-email']") WebElement txt_Username;
	@FindBy(id="input-password") WebElement txt_Password;
	@FindBy(xpath="//*[@type='submit']") WebElement login_btn;

	
	//Action methods
	
	
	
   public void setUsername(String email)
   
   {
	   WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	   wait.until(ExpectedConditions.visibilityOf(txt_Username));
	   wait.until(ExpectedConditions.elementToBeClickable(txt_Username)); 
	   txt_Username.click();
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
