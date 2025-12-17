package testClass;

import org.testng.annotations.Test;

import pageObjectClass.EditAcc;
import pageObjectClass.loginPage;
import testBase.BaseClass;

public class TC003_EditAccount extends BaseClass {
	
	@Test
	public void editAccount()
	{
		doLogin();
		EditAcc ea=new EditAcc(driver);
		ea.editAccount();
		ea.emailID(p.getProperty("emailid"));
		ea.continueButton();	
		
	}
	
	

}
