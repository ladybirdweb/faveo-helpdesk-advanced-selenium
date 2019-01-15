package Generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class inputarray  
{
	public ArrayList readexceldata(int col) throws IOException
	{
		FileInputStream fis=new FileInputStream("G:\\faveo-helpdesk-selenium\\data\\New Microsoft Excel Worksheet.xlsx");
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet s=wb.getSheet("sheet4");
		Iterator<Row> rowIterator=s.iterator();
		rowIterator.next();
		ArrayList<String> list=new ArrayList<String>();
		while(rowIterator.hasNext())
		{
			list.add(rowIterator.next().getCell(col).getStringCellValue());
		}
		return list;
	}
	
	
}
