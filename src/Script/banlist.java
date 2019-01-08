package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.banlists;

public class banlist extends Basetest 
{
	@Test
	public void test5() 
	{
		banlists list=new banlists(driver);
		list.clicklogin();
		list.username(input.getdata(excel, "sheet1", 0, 1));
		list.passsword(input.getdata(excel, "sheet1", 1, 1));
		list.clicklogin1();
		list.clickAdminpanel();
		list.clickbanlist();
	}
}
