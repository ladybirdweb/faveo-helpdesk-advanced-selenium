package loginscriptviaregister;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic.Basetestloginviaregister;
import Generic.input;
import loginpage.loginViaRegister;

public class agentunverified extends Basetestloginviaregister
{
	@Test
	public void test()
	{
		loginViaRegister unverified=new loginViaRegister(driver);
		unverified.clickregister();
		unverified.clicklogin();
		unverified.authusername(input.getdata(excel, "sheet2", 22, 1));
		unverified.authpassword(input.getdata(excel, "sheet2", 23, 1));
		unverified.clickauthloginbuttion();
	}

}
