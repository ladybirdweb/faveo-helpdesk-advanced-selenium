package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.logs;

public class Logs extends Basetest 
{
	@Test
	public void test31()
	{
		logs log=new logs(driver);
		log.clicklogin();
		log.username(input.getdata(excel, "sheet1", 0, 1));
		log.passsword(input.getdata(excel, "sheet1", 1, 1));
		log.clicklogin1();
		log.clickAdminpanel();
		log.clicklogs();
	}

}
