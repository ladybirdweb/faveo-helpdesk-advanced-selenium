package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.diagnostics;

public class diagnostic extends Basetest 
{
	@Test
	public void test7()
	{
		diagnostics dia=new diagnostics(driver);
		dia.clicklogin();
		dia.username(input.getdata(excel, "sheet1", 0, 1));
		dia.passsword(input.getdata(excel, "sheet1", 1, 1));
		dia.clicklogin1();
		dia.clickAdminpanel();
		dia.clickdiagnostics();
	}
}
