package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.approvalworkflow;

public class approveflow extends Basetest 
{
	@Test
	public void test12()
	{
		approvalworkflow flow=new approvalworkflow(driver);
		flow.clicklogin();
		flow.username(input.getdata(excel, "sheet1", 0, 1));
		flow.passsword(input.getdata(excel, "sheet1", 1, 1));
		flow.clicklogin1();
		flow.clickAdminpanel();
		flow.apworkflow();
	}

}
