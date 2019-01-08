package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.faveoqueues;

public class queue extends Basetest
{
	@Test
	public void test7()
	{
		faveoqueues queue=new faveoqueues(driver);
		queue.clicklogin();
		queue.username(input.getdata(excel, "sheet1", 0, 1));
		queue.passsword(input.getdata(excel, "sheet1", 1, 1));
		queue.clicklogin1();
		queue.clickAdminpanel();
		queue.clickqueues();
	}

}
