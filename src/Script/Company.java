package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.company;

public class Company extends Basetest 
{
	@Test
	public void Test23()
	{
		company company=new company(driver);
		company.clicklogin();
		company.username(input.getdata(excel, "sheet1", 0, 1));
		company.passsword(input.getdata(excel, "sheet1",1, 1));
		company.clicklogin1();
		company.clickAdminpanel();
		company.clickcompany();
	}

}
