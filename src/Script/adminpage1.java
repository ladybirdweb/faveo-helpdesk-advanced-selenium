package Script;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import Generic.Basetest;
import Page.faveoadminpage;

public class adminpage1 extends Basetest 
{
	@Test
	public void test1() throws EncryptedDocumentException, InvalidFormatException, IOException 
{
		faveoadminpage Admin=new faveoadminpage(driver);
		Admin.clicklogin();
		FileInputStream fis = new FileInputStream("/faveo-helpdesk-selenium/data/New Microsoft Excel Worksheet.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("sheet4");
		int uname = sh.getLastRowNum()-sh.getFirstRowNum();
		  int pwd = sh.getRow(0).getLastCellNum();
        for(int i=1;i<=uname;i++)
        {
        	String uname1 = sh.getRow(i).getCell(0).getStringCellValue();
        }
        for(int i=1;i<=pwd;i++)
        {
        	String pwd1 = sh.getRow(i).getCell(1).getStringCellValue();
        }
		Admin.clicklogin1();
		Admin.clickAdminpanel();
}

}
