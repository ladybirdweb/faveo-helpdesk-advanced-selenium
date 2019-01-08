package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.manage;

public class helptopics extends Basetest 
{
	@Test
	public void test8() throws InterruptedException
	{
		manage help=new manage(driver);
		help.clicklogin();
		help.username(input.getdata(excel, "sheet1", 0, 1));
		help.passsword(input.getdata(excel, "sheet1", 1, 1));
		help.clicklogin1();
		help.clickAdminpanel();
		help.scrollhelp();
	}

}
