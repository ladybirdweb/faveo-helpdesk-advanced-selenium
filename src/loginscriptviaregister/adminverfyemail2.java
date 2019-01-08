package loginscriptviaregister;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic.Basetestloginviaregister;
import Generic.input;
import loginpage.loginViaRegister;
;

public class adminverfyemail2 extends Basetestloginviaregister 
{
	@Test
	public void test()
	{
	loginViaRegister email2=new loginViaRegister(driver);
	email2.clickregister();
	email2.clicklogin();
	email2.authusername(input.getdata(excel, "sheet2", 4, 1));
	email2.authpassword(input.getdata(excel, "sheet2", 5, 1));
	email2.clickauthloginbuttion();
	WebElement admin=driver.findElement(By.xpath("//a[text()='Admin Panel']"));
	email2.elementvisiblity(admin);
	}
}