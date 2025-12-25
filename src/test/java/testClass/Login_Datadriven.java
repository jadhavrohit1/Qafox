package testClass;

import org.testng.annotations.Test;

import Base.BaseClass;
import pageObjectClass.Homepage;
import pageObjectClass.loginPage;

public class Login_Datadriven extends BaseClass {
	
	
//	@Test(dataProvider = "LoginData", dataProviderClass = utilities.DataProviders.class)
	public void verify_Login(String email, String password) throws InterruptedException
	{
		Homepage hp=new Homepage(driver);
		
		logger.info("  Login test cases started ***");
		
    	hp.clickMyAcc();
    	logger.info("*** Clicked on the MyAccount link ***");
    	
		Thread.sleep(5000);
		loginPage lp=new loginPage(driver);
		
		
		hp.clickLogingLink();
    	logger.info("*** Clicked on the login link ***");
		
		lp.setUsername(email);
		
    	logger.info("*** Entered username ***");

		lp.setPassword(password);
		
    	logger.info("*** Entered password ***");

		lp.clickLoginBtn();
		
    	logger.info("*** Clicked on the login button ***");

	}
	

	

}
