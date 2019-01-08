package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.debugoptions;

public class Debugoptions extends Basetest 
{
	@Test
	public void Test31()
	{
		debugoptions options=new debugoptions(driver);
		options.clicklogin();
		options.username(input.getdata(excel, "sheet1", 0,1));
		options.passsword(input.getdata(excel, "sheet1", 1, 1));
		options.clicklogin1();
		options.clickAdminpanel();
		options.clickdebugoptions();
	}

}
