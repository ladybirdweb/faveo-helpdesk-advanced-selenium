package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.system;

public class System extends Basetest 
{
	@Test
	public void Test24()
	{
		system sys=new system(driver);
		sys.clicklogin();
		sys.username(input.getdata(excel, "sheet1", 0, 1));
		sys.passsword(input.getdata(excel, "sheet1", 1, 1));
		sys.clicklogin1();
		sys.clickAdminpanel();
		sys.clicksystem();
	}

}
