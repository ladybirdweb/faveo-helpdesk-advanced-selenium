package loginscriptviaregister;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic.Basetestloginviaregister;
import Generic.input;
import loginpage.loginViaRegister;

public class userdeactivated extends Basetestloginviaregister 
{
	@Test
	public void test()
	{
		loginViaRegister usd=new loginViaRegister(driver);
		usd.clickregister();
		usd.clicklogin();
		usd.authusername(input.getdata(excel, "sheet2", 40,1));
		usd.authpassword(input.getdata(excel, "sheet2", 41, 1));
		usd.clickauthloginbuttion();
		WebElement BAN=driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
		usd.userbann(BAN);
	}
}
