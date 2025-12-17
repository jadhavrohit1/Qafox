package testClass;

import org.testng.annotations.Test;

import pageObjectClass.Homepage;
import pageObjectClass.loginPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_003_Login_DataDriven extends BaseClass {
	
	@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class)
	public void verify_Login() throws InterruptedException
	{
		Homepage hp=new Homepage(driver);
		
		logger.info("  Login test cases started ***");
		
    	hp.clickMyAcc();
    	logger.info("*** Clicked on the MyAccount link ***");
    	
		loginPage lp=new loginPage(driver);
		
		hp.clickLogingLink();
    	logger.info("*** Clicked on the login link ***");
	
    	lp.setUsername("email");
    	logger.info("*** Entered username ***");

		lp.setPassword("pass");
		
    	logger.info("*** Entered password ***");

		lp.clickLoginBtn();
		
    	logger.info("*** Clicked on the login button ***");

    	
    	
	}
	

	

}
