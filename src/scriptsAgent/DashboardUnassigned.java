package scriptsAgent;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.dashboardunassigned;

public class DashboardUnassigned extends Basetest
{
	@Test
	public void Test()
	{
		dashboardunassigned unassigned=new dashboardunassigned(driver);
		unassigned.clicklogin11();
		unassigned.username11(input.getdata(excel, "sheet1", 0, 1));
		unassigned.passsword11(input.getdata(excel, "sheet1", 1, 1));
		unassigned.clicklogin21();
		unassigned.clickdashboard();
		unassigned.clickunassigned();
	}

}
