package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.status;

public class Status extends Basetest 
{
	@Test
	public void Test15()
	{
		status stat=new status(driver);
		stat.clicklogin();
		stat.username(input.getdata(excel, "sheet1", 0, 1));
		stat.passsword(input.getdata(excel, "sheet1", 1, 1));
		stat.clicklogin1();
		stat.clickAdminpanel();
		stat.clickstatus();
	}

}
