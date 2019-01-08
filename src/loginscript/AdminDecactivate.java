package loginscript;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import loginpage.basiclogin;

public class AdminDecactivate extends Basetest
{
	@Test
	public void test() throws InterruptedException
	{
		basiclogin login=new basiclogin(driver);
		login.clicklogin();
		login.username(input.getdata(excel, "sheet2", 10, 1));
		login.passsword(input.getdata(excel, "sheet2", 11, 1));
		login.clicklogin1();
		login.adminpanel();
	}

}
