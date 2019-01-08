package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.modules;

public class Modules extends Basetest 
{
	@Test
	public void Test31()
	{
		modules module=new modules(driver);
		module.clicklogin();
		module.username(input.getdata(excel, "sheet1", 0, 1));
		module.passsword(input.getdata(excel, "sheet1", 1, 1));
		module.clicklogin1();
		module.clickAdminpanel();
		module.clickmodules();
	}

}
