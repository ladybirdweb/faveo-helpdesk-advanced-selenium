package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.sociallogin;

public class Sociallogin extends Basetest 
{
	@Test
	public void Test25()
	{
		sociallogin login=new sociallogin(driver);
		login.clicklogin();
		login.username(input.getdata(excel, "sheet1", 0, 1));
		login.passsword(input.getdata(excel, "sheet1", 1, 1));
		login.clicklogin1();
		login.clickAdminpanel();
		login.clicksociallogin();
	}

}
