package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Base.BaseClass;

public class ScreenshotUtil extends BaseClass{
	
	
	
	public static File captureScreenshot(String testname) throws IOException
	{
		
		
		try {
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		File targetPath=new File(System.getProperty("user.dir") +"\\Screenshot\\open.png");
		
		src.renameTo(targetPath);
		return targetPath;	
				
	}
		
		catch(Exception e)
		
		{
			e.getMessage();
		}
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	

}
