package testClass;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjectClass.Homepage;
import pageObjectClass.Registration;
import testBase.BaseClass;

public class TC_001_Registration extends BaseClass {
	
    @Test
    public void verify_acc_registration()
    {
    	
    	logger.info("*** Test case started");
    	Homepage hp=new Homepage(driver);
    	hp.clickMyAcc();
    	logger.info("***clicked on the myaccount ***");
    	hp.clickRegister();  
    	logger.info("***clicked on the Register tab ***");

    	Registration rg=new Registration(driver);
    	rg.setFirstName("rohit");
    	logger.info("***Entered first name ***");

    	rg.setLastName("jadhav");
    	logger.info("***Entered last name ***");

    	rg.setEmail(randomString()+"@gmail.com");
    	logger.info("***Entered email ID ***");

    	rg.setTelephone("1111111111");
    	logger.info("***Entered Mobile number ***");

    	rg.setPassword("123456123");
    	logger.info("***Entered password ***");

    	rg.setConfirmPassword("123456123");
    	logger.info("***Entered Confirm password ***");

    	rg.setprivacyPolicy();
    	logger.info("***clicked on the privacyPolicy Checkbox ***");

    	rg.clickContinueBtn();
    	logger.info("***Clicked on the continue button ***");

    	String conMsg=rg.getConfirmationMsg();
    	logger.info("***Received confirmation message ***");

    	
        Assert.assertEquals(conMsg, "Your Account Has Been Created!");
    	
    	
    }
	
    public String randomString()
    {
    	String generatedstring=RandomStringUtils.randomAlphabetic(5);
    	return generatedstring;
    }
    
    
    
	
	

}
