package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.emailsettings;

public class emailsetting extends Basetest
{
	@Test
	public void test3()
	{
		emailsettings email=new emailsettings(driver);
		email.clicklogin();
		email.username(input.getdata(excel, "sheet1", 0, 1));
		email.passsword(input.getdata(excel, "sheet1", 1, 1));
		email.clicklogin1();
		email.clickAdminpanel();
		email.clickemailpanel();
	}
}
