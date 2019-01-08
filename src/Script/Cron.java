package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.cron;

public class Cron extends Basetest 
{
	@Test
	public void Test26()
	{
		cron cron=new cron(driver);
		cron.clicklogin();
		cron.username(input.getdata(excel, "sheet1", 0, 1));
		cron.passsword(input.getdata(excel, "sheet1", 1, 1));
		cron.clicklogin1();
		cron.clickAdminpanel();
		cron.clickcron();
	}

}
