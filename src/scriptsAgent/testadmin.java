package scriptsAgent;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.Testadmin;

public class testadmin extends Basetest 
{
	@Test
	public void Test()
	{
	Testadmin test=new Testadmin(driver);
	test.clicklogin11();
	test.username11(input.getdata(excel, "sheet1", 0, 1));
	test.passsword11(input.getdata(excel, "sheet1", 1, 1));
	test.clicklogin21();
	test.clicktestadmin();
	test.clickeditprofile();
	}

}
