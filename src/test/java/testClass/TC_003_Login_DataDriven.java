package testClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseClass;
import pageObjectClass.Homepage;
import pageObjectClass.loginPage;
import utilities.DataProviders;

public class TC_003_Login_DataDriven extends BaseClass {
	
	@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class)
	public void	verifyLogin(String useremail, String userpass)
	{
		Homepage hp=new Homepage(driver);
    	hp.clickLogingLink();
    	
    	loginPage lp=new loginPage(driver);
    	lp.setUsername(useremail);
    	lp.setPassword(userpass);
    	lp.clickLoginBtn();	
    	
        Assert.fail("Intentionally failing test to verify screenshot capture");
       
	}
}

    	
	
	

	


