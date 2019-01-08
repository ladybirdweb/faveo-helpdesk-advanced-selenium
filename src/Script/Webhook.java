package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.webhook;

public class Webhook extends Basetest 
{
	@Test
	public void Test30()
	{
		webhook hook=new webhook(driver);
		hook.clicklogin();
		hook.username(input.getdata(excel, "sheet1", 0, 1));
		hook.passsword(input.getdata(excel, "sheet1", 1, 1));
		hook.clicklogin1();
		hook.clickAdminpanel();
		hook.clickwebhook();
	}

}
