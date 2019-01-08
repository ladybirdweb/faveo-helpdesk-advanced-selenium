package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.api;

public class Api extends Basetest 
{
	@Test
	public void Test29()
	{
		api api=new api(driver);
		api.clicklogin();
		api.username(input.getdata(excel, "sheet1", 0, 1));
		api.passsword(input.getdata(excel, "sheet1", 1, 1));
		api.clicklogin1();
		api.clickAdminpanel();
		api.clickapi();
	}

}
