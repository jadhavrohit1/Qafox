package testClass;

import org.testng.annotations.Test;

import pageObjectClass.Homepage;
import pageObjectClass.loginPage;
import testBase.BaseClass;

public class TC_002_Login extends BaseClass {
	
	
	@Test
	public void verify_Login() throws InterruptedException
	{
		Homepage hp=new Homepage(driver);
		
		logger.info("  Login test cases started ***");
		
    	hp.clickMyAcc();
    	logger.info("*** Clicked on the MyAccount link ***");
    	
		loginPage lp=new loginPage(driver);
		
		lp.clickLogingLink();
    	logger.info("*** Clicked on the login link ***");
	
    	lp.setUsername(p.getProperty("email"));
		
    	logger.info("*** Entered username ***");

		lp.setPassword(p.getProperty("pass"));
		
    	logger.info("*** Entered password ***");

		lp.clickLoginBtn();
		
    	logger.info("*** Clicked on the login button ***");

    	
    	
	}
	

	

}
