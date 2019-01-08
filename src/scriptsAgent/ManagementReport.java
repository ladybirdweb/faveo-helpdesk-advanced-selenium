package scriptsAgent;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.managementreport;

public class ManagementReport extends Basetest 
{
	@Test
	public void Test9()
	{
		managementreport report=new managementreport(driver);
		report.clicklogin11();
		report.username11(input.getdata(excel, "sheet1", 0, 1));
		report.passsword11(input.getdata(excel, "sheet1", 1, 1));
		report.clicklogin21();
		report.clickreportpage();
		report.clickmanagementreport();
	}

}
