package testBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	
	
    public WebDriver driver;
    
    public Logger logger; 
	
    public Properties p;
    
    @BeforeClass
    @Parameters({"os","browser"})
	public void setUp(String os, String browser, ITestContext context)
	{
    	
    	logger=LogManager.getLogger(this.getClass());  //dymanically getting the class
    	
    	switch (browser)
    	{
    	case "chrome" :  driver=new ChromeDriver();  break;
    	case "firefox" : driver=new FirefoxDriver(); break;
    	default : System.out.println("inavlid Browser");
    	}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		driver.manage().window().maximize(); return;	  //return - to stop rest of the execution
	} 
	
    
  /*  @BeforeClass
	public void setUp() throws IOException
	{
    	
    	FileInputStream file=new FileInputStream(".//src//test//resources//config.properties");
    	p=new Properties ();
    	p.load(file);
    	
    	logger=LogManager.getLogger(this.getClass());  //dymanically getting the class
    	
    	
    	driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p.getProperty("appURL"));
		driver.manage().window().maximize(); return;	  //return - to stop rest of the execution
	} */
    
   // @AfterClass
	public void tearDown()
	{
		driver.close();
	}
	
	
	

}
