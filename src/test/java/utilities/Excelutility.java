package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutility {
	
	
	
	public static Object[][] getData(String path, String sheetname) throws IOException
	{
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet");
		
		int totalrows=sheet.getLastRowNum();
		int totalcells=sheet.getRow(1).getLastCellNum();
		
	    Object[][] data = new Object[totalrows][totalcells];

		
		for (int i=1; i<totalrows; i++)
		{
			XSSFRow row=sheet.getRow(i);
			
			for (int c=0; c<totalcells; c++)
			{
				XSSFCell cell=row.getCell(c);
				data[i-1][c]=cell.toString();
			}
		}
		   workbook.close();
		    return data;
		
		
		
	}
}
	
	
	

