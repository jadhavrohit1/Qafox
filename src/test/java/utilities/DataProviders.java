package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
    @DataProvider(name = "LoginData")
	public Object[][] getLoginData() throws IOException
	{
    	String path = System.getProperty("user.dir") + "/TestData/testdata.xlsx";
        return Excelutility.getData(path, "sheet");
 
	}

}
