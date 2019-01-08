package Generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class input 
{
	static String value;
	public static String getdata(String path,String sheet,int row,int column)
	{
		try
		{
			FileInputStream f=new FileInputStream(path);
			Workbook book=WorkbookFactory.create(f);
			value=book.getSheet(sheet).getRow(row).getCell(column).getStringCellValue();
			
		}
		catch(Exception e)
		{
			
		}
		return value;
	}
	
}
