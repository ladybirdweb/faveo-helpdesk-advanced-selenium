package loginscriptviaregister;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic.Basetestloginviaregister;
import Generic.input;
import loginpage.loginViaRegister;

public class adminverified extends Basetestloginviaregister 
{
	@Test
	public void test()
	{
		loginViaRegister adminverified=new loginViaRegister(driver);
		adminverified.clickregister();
		adminverified.clicklogin();
		adminverified.authusername(input.getdata(excel, "sheet2", 0, 1));
		adminverified.authpassword(input.getdata(excel, "sheet2", 1, 1));
		adminverified.clickauthloginbuttion();
		WebElement admin=driver.findElement(By.xpath("//a[text()='Admin Panel']"));
		adminverified.elementvisiblity(admin);
	}
}
