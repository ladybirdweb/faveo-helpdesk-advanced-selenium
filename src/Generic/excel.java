package Generic;


	import java.io.FileInputStream;
	import org.apache.poi.ss.usermodel.WorkbookFactory;



	public  class excel {
		

		public static int getRowCount(String path,String sheet)
		{
			int r=0;
			try{
				
				r=WorkbookFactory.create(new FileInputStream(path)).getSheet(sheet).getLastRowNum();
			}
			catch(Exception e)
			{
				
				e.printStackTrace();
			}
			return r;
		}

		public static String getCellValue(String path,String sheet,int r,int c)
		{
			String value="/faveo-helpdesk-selenium/data/New Microsoft Excel Worksheet.xlsx";
			try{
				
				value=WorkbookFactory.create(new FileInputStream(path)).getSheet(sheet).getRow(r).getCell(c).toString();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return value;
		}
	}
		
		
		

	
