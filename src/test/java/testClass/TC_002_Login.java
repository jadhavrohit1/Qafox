package testClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseClass;
import pageObjectClass.Homepage;
import pageObjectClass.loginPage;
import listeners.RetryAnalyzer;


public class TC_002_Login extends BaseClass {
	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void verify_Login() throws InterruptedException
	{
		Homepage hp=new Homepage(driver);
		
		logger.info("  Login test cases started ***");
    	
    	hp.clickLogingLink();
    	logger.info("*** Clicked on the login link ***");
    	
		loginPage lp=new loginPage(driver);
		
    	lp.setUsername(p.getProperty("email"));
    	logger.info("*** Entered username ***");

		lp.setPassword(p.getProperty("pass"));
		
    	logger.info("*** Entered password ***");

		lp.clickLoginBtn();
		
    	logger.info("*** Clicked on the login button ***");

    	
    	Assert.fail("Failing intentionally to test retry logic");
	}
	

	

}
