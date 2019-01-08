package scriptsAgent;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.timesheetsummary;

public class TimesheetSummary extends Basetest 
{
@Test
public void Test8()
{
	timesheetsummary summary=new timesheetsummary(driver);
	summary.clicklogin11();
	summary.username11(input.getdata(excel, "sheet1", 0, 1));
	summary.passsword11(input.getdata(excel, "sheet1", 1, 1));
	summary.clicklogin21();
	summary.clickreportpage();
	summary.clicktimesheetsummary();
}
}
