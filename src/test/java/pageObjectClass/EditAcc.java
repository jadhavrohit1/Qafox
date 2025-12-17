package pageObjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditAcc extends BasePage{
	
	public EditAcc(WebDriver driver)
	{
		super(driver);
	}
	
	//locator
	
	@FindBy(partialLinkText="Edit") WebElement editAccount;
	@FindBy(id="input-email\"") WebElement emailid;
	@FindBy(xpath="//*[@type='submit']") WebElement continueBtn;
	
	
	//Actions methods
	
	
	public void editAccount()
	{
		editAccount.click();
	}
	
	public void emailID(String eid)
	{
		emailid.sendKeys(eid);
	}
	
	public void continueButton()
	{
		continueBtn.click();
	}
	
	

}
