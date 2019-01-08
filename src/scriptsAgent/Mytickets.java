package scriptsAgent;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.mytickets;;

public class Mytickets extends Basetest 
{
	@Test
	public void Test()
	{
		mytickets ticket=new mytickets(driver);
		ticket.clicklogin11();
		ticket.username11(input.getdata(excel, "sheet1", 0, 1));
		ticket.passsword11(input.getdata(excel, "sheet1", 1, 1));
		ticket.clicklogin21();
		ticket.clickdashboard();
		ticket.clickmytickets();
	}

}
