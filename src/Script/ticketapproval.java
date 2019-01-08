package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.closeticketapproval;

public class ticketapproval extends Basetest 
{
	@Test
	public void test28()
	{
		closeticketapproval approval=new closeticketapproval(driver);
		approval.clicklogin();
		approval.username(input.getdata(excel, "sheet1", 0, 1));
		approval.passsword(input.getdata(excel, "sheet1", 1, 1));
		approval.clicklogin1();
		approval.clickAdminpanel();
		approval.ticketapproval();
	}

}
