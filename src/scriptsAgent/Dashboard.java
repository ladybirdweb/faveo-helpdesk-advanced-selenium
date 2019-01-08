package scriptsAgent;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.dashboard;

public class Dashboard extends Basetest 
{
	@Test
	public void Test16()
	{
		dashboard db=new dashboard(driver);
		db.clicklogin11();
		db.username11(input.getdata(excel, "sheet1", 0, 1));
		db.passsword11(input.getdata(excel, "sheet1", 1, 1));
		db.clicklogin21();
		db.clickdashboard();
		db.clickinbox();
	}
}
