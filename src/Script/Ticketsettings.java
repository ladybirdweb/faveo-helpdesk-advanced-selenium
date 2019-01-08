package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.ticketsettings;

public class Ticketsettings extends Basetest 
{
	@Test
	public void Test14()
	{
		ticketsettings settings=new ticketsettings(driver);
		settings.clicklogin();
		settings.username(input.getdata(excel, "sheet1", 0, 1));
		settings.passsword(input.getdata(excel, "sheet1", 1, 1));
		settings.clicklogin1();
		settings.clickAdminpanel();
		settings.ticketsettings();
	}

}
