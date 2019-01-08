package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.dashboardstat;

public class Dashboardstat extends Basetest 
{
	@Test
	public void Test23()
	{
		dashboardstat stat=new dashboardstat(driver);
		stat.clicklogin();
		stat.username(input.getdata(excel, "sheet1", 0, 1));
		stat.passsword(input.getdata(excel, "sheet1", 1 ,1));
		stat.clicklogin1();
		stat.clickAdminpanel();
        stat.clickdashboardstat();
	}

}
