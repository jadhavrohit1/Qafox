package pageObjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration extends BasePage {
	
	
	public Registration(WebDriver driver)
	{
		super(driver);
	}
	
	// @FindBy and save elements in varibales to perform actions
	
	@FindBy(name="firstname") WebElement txt_fname;
	@FindBy(name="lastname") WebElement txt_lname;
	@FindBy(name="email") WebElement txt_mail;
	@FindBy(name="telephone") WebElement txt_tp;
	@FindBy(name="password") WebElement txt_pwd;
	@FindBy(name="confirm") WebElement txt_cpwd;
	@FindBy(name="agree") WebElement polcy;
	@FindBy(xpath="//*[@type='submit']") WebElement contBtn;
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']") WebElement msgConfirmation;
	
// Action methods for web elements
	
	
	public void setFirstName(String fname)
	{
		txt_fname.sendKeys(fname);
	}
	
	public void setLastName(String lname)
	{
	   txt_lname.sendKeys(lname);	
	
	}
	
	public void setEmail(String emailId)
	{
	   txt_mail.sendKeys(emailId);
	 
	}
	
	public void setTelephone(String tpNum)
	{
		txt_tp.sendKeys(tpNum);
	}
	
	public void setPassword(String pwd)
	{
		txt_pwd.sendKeys(pwd);
	}
	
	
	public void setConfirmPassword(String pwd)
	{
		txt_cpwd.sendKeys(pwd);
	}
	
	
	public void setprivacyPolicy()
	{
		polcy.click();
	}
	
	public void clickContinueBtn()
	{
		contBtn.click();
	}
	
	 public String getConfirmationMsg()
	{
		 
		 try
		 {
		String message=msgConfirmation.getText();
		return message;
		 }
		 
		 catch (Exception e)
		 {
			return(e.getMessage());
		 }
		 
	}
	 
	
	
	
	
	

}
