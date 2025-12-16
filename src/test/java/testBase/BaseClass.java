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
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass 


{	
	
	  public static WebDriver driver;
	    
	    public static Logger logger; 
		
	    public static Properties p;
	    
	    @BeforeSuite
	    public void config() throws IOException
	    {
	    	FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//config.properties");
	    	p=new Properties ();
	    	p.load(file);
	    }
	    
	    
	    @BeforeTest
	    @Parameters({"os","browser"})
		public void setUp(String os, String browser, ITestContext context) throws IOException
		{    	
	    	switch (browser)
	    	{
	    	case "chrome" :  driver=new ChromeDriver();  break;
	    	case "firefox" : driver=new FirefoxDriver(); break;
	    	default : System.out.println("inavlid Browser");
	    	}
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
		} 
	    
	    
	    @BeforeClass
	    public void beforeClass() {
	        logger = LogManager.getLogger(this.getClass());
	    }
	    
	    
	    @BeforeMethod
	    public void launchApp()
	    {
	    	driver.get(p.getProperty("appURL"));
	    }
	    
	    
	    @AfterTest
	    public void tearDown()
	    {
	    	driver.quit();
	    }
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
    public static WebDriver driver;
    
    public static Logger logger; 
	
    public static Properties p;
    
    @BeforeSuite
    public void config() throws IOException
    {
    	FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//config.properties");
    	p=new Properties ();
    	p.load(file);
    }
    
    
    
    @BeforeClass
    @Parameters({"os","browser"})
	public void setUp(String os, String browser, ITestContext context) throws IOException
	{
    	logger=LogManager.getLogger(this.getClass());  //dymanically getting the class
    	
    	switch (browser)
    	{
    	case "chrome" :  driver=new ChromeDriver();  break;
    	case "firefox" : driver=new FirefoxDriver(); break;
    	default : System.out.println("inavlid Browser");
    	}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize(); return;	  //return - to stop rest of the execution
	} 
    
    @BeforeMethod
    public void launchApp()
    {
    	driver.get(p.getProperty("appURL"));
    }
    
    
    @AfterClass
    public void tearDown()
    {
    	driver.quit();
    }
    
    
*/
  
	
  
    

    

	
	
	
	
	





























































/*

@BeforeClass
@Parameters({"os","browser"})
public void setUp(String os, String browser, ITestContext context) throws IOException
{
	
	FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//config.properties");
	p=new Properties ();
	p.load(file);
	
	logger=LogManager.getLogger(this.getClass());  //dymanically getting the class
	
	switch (browser)
	{
	case "chrome" :  driver=new ChromeDriver();  break;
	case "firefox" : driver=new FirefoxDriver(); break;
	default : System.out.println("inavlid Browser");
	}
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(p.getProperty("appURL"));
	driver.manage().window().maximize(); return;	  //return - to stop rest of the execution
} 

  

@AfterClass
public void tearDown()
{
	driver.quit();
}


*/















