package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.storage;

public class Storage extends Basetest 
{
	@Test
	public void Test28() 
	{
		storage str=new storage(driver);
		str.clicklogin();
		str.username(input.getdata(excel, "sheet1", 0, 1));
		str.passsword(input.getdata(excel, "sheet1", 1, 1));
		str.clicklogin1();
		str.clickAdminpanel();
		str.clickstorage();
		
	}

}
