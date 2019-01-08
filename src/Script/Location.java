package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.location;

public class Location extends Basetest 
{
	@Test
	public void Test22()
	{
		location loc=new location(driver);
		loc.clicklogin();
		loc.username(input.getdata(excel, "sheet1", 0, 1));
		loc.passsword(input.getdata(excel, "sheet1", 1, 1));
		loc.clicklogin1();
		loc.clickAdminpanel();
		loc.clicklocation();
	}

}
