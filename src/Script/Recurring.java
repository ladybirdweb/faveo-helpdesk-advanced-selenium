package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.recurring;

public class Recurring extends Basetest 
{
	@Test
	public void Test21()
	{
		recurring reccur=new recurring(driver);
		reccur.clicklogin();
		reccur.username(input.getdata(excel, "sheet1", 0, 1));
		reccur.passsword(input.getdata(excel, "sheet1", 1, 1));
		reccur.clicklogin1();
		reccur.clickAdminpanel();
		reccur.clickrecurring();
	}

}
