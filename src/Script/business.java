package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.businesshours;

public class business extends Basetest 
{
	@Test
	public void Test9() throws InterruptedException
	{
		businesshours hours=new businesshours(driver);
		hours.clicklogin();
		hours.username(input.getdata(excel, "sheet1", 0, 1));
		hours.passsword(input.getdata(excel, "sheet1", 1, 1));
		hours.clicklogin1();
		hours.clickAdminpanel();
		hours.businesshour();
	}

}
