package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.security;

public class Security extends Basetest 
{
@Test
public void Test26()
{
	security security=new security(driver);
	security.clicklogin();
	security.username(input.getdata(excel, "sheet1", 0, 1));
	security.passsword(input.getdata(excel, "sheet1", 1, 1));
	security.clicklogin1();
	security.clickAdminpanel();
	security.clicksecurity();
}
}
