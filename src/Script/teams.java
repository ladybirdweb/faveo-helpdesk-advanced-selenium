package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.faveoteams;

public class teams extends Basetest
{
	@Test
	public void test4()
	{
		faveoteams teams=new faveoteams(driver);
		teams.clicklogin();
		teams.username(input.getdata(excel, "sheet1", 0, 1));
		teams.passsword(input.getdata(excel, "sheet1", 1, 1));
		teams.clicklogin1();
		teams.clickAdminpanel();
		teams.clickteams();
	}
}
