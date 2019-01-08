package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.source;

public class Sources extends Basetest 
{
	@Test
	public void Test20()
	{
		source src=new source(driver);
		src.clicklogin();
		src.username(input.getdata(excel, "sheet1", 0, 1));
		src.passsword(input.getdata(excel, "sheet1", 1, 1));
		src.clicklogin1();
		src.clickAdminpanel();
		src.clicksource();
	}

}
