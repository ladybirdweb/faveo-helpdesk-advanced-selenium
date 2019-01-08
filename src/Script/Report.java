package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.report;

public class Report extends Basetest 
{
	@Test
	public void test30()
	{
		report report=new report(driver);
		report.clicklogin();
		report.username(input.getdata(excel, "sheet1", 0, 1));
		report.passsword(input.getdata(excel, "sheet1", 1, 1));
		report.clicklogin1();
		report.clickAdminpanel();
		report.clickreport();
	}

}
