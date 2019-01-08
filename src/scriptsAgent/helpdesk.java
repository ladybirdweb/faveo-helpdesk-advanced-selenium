package scriptsAgent;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.helpdeskindepth;

public class helpdesk extends Basetest 
{
	@Test
	public void Test2()
	{
		helpdeskindepth help=new helpdeskindepth(driver);
		help.clicklogin11();
		help.username11(input.getdata(excel, "sheet1", 0, 1));
		help.passsword11(input.getdata(excel, "sheet1", 1, 1));
		help.clicklogin21();
		help.clickreportpage();
		help.helpdeskindepth();
	}

}
