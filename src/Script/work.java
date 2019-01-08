package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.workflo;

public class work extends Basetest 
{
	@Test
	public void Test11()
	{
		workflo flo=new workflo(driver);
		flo.clicklogin();
		flo.username(input.getdata(excel, "sheet1", 0,1));
		flo.passsword(input.getdata(excel, "sheet1", 1, 1));
		flo.clicklogin1();
		flo.clickAdminpanel();
		flo.workflw();
	}

}
