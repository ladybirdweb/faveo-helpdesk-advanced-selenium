package loginscript;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import loginpage.basiclogin;

public class LoginScript1 extends Basetest 
{
	@Test
	public void test() throws InterruptedException
	{
		basiclogin login=new basiclogin(driver);
		login.clicklogin();
		login.username(input.getdata(excel, "sheet2", 0, 1));
		login.passsword(input.getdata(excel, "sheet2", 1, 1));
		login.clicklogin1();
		login.adminpanel();
	}

}
