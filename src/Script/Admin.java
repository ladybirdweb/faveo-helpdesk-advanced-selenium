package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.faveoadminpage;

public class Admin extends Basetest 
{
	@Test
	public void test1() 
{
		faveoadminpage Admin=new faveoadminpage(driver);
		Admin.clicklogin();
		Admin.username(input.getdata(excel, "sheet1", 0, 1));
		Admin.passsword(input.getdata(excel, "sheet1", 1, 1));
		Admin.clicklogin1();
		Admin.clickAdminpanel();
}
}
