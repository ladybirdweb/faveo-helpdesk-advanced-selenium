package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.tickettypes;

public class Ticketype extends Basetest 
{
	@Test
	public void test12() 
	{
		tickettypes type=new tickettypes(driver);
		type.clicklogin();
		type.username(input.getdata(excel, "sheet1", 0, 1));
		type.passsword(input.getdata(excel, "sheet1", 1, 1));
		type.clicklogin1();
		type.clickAdminpanel();
		type.tickettype();
		
	}

}
