package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.listners;

public class Listeners extends Basetest 
{
	@Test
	public void Test15()
	{
		listners lit=new listners(driver);
		lit.clicklogin();
		lit.username(input.getdata(excel, "sheet1", 0, 1));
		lit.passsword(input.getdata(excel, "sheet1",1, 1));
		lit.clicklogin1();
		lit.clickAdminpanel();
		lit.listen();
	}

}
