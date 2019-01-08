package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.slaplans;

public class slaplan extends Basetest 
{
	@Test
	public void Test9() throws InterruptedException
	{
		slaplans plan=new slaplans(driver);
		plan.clicklogin();
		plan.username(input.getdata(excel, "sheet1", 0, 1));
		plan.passsword(input.getdata(excel, "sheet1", 1, 1));
		plan.clicklogin1();
		plan.clickAdminpanel();
		plan.clickslaplans();
	}

}
