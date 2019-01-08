package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.billing;

public class Billing extends Basetest 
{
	@Test
	public void Test18()
	{
		billing bill=new billing(driver);
		bill.clicklogin();
		bill.username(input.getdata(excel, "sheet1", 0, 1));
		bill.passsword(input.getdata(excel, "sheet1", 1, 1));
		bill.clicklogin1();
		bill.clickAdminpanel();
		bill.clickbilling();
	}

}
