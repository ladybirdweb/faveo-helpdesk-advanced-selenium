package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.ticketform;

public class ticket extends Basetest 
{
	@Test
	public void test10() throws InterruptedException
	{
		ticketform ticket=new ticketform(driver);
		ticket.clicklogin();
		ticket.username(input.getdata(excel, "sheet1", 0, 1));
		ticket.passsword(input.getdata(excel, "sheet1", 1, 1));
		ticket.clicklogin1();
		ticket.clickAdminpanel();
		ticket.ticketforms();
	}

}
