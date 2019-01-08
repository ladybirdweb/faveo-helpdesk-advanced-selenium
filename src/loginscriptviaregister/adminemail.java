package loginscriptviaregister;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic.Basetestloginviaregister;
import Generic.input;
import loginpage.loginViaRegister;

public class adminemail extends Basetestloginviaregister 
{
	@Test
	public void test()
	{
		loginViaRegister email=new loginViaRegister(driver);
		email.clickregister();
		email.clicklogin();
		email.authusername(input.getdata(excel, "sheet2", 4,1));
		email.authpassword(input.getdata(excel, "sheet2", 5, 1));
		email.clickauthloginbuttion();
		WebElement admin=driver.findElement(By.xpath("//a[text()='Admin Panel']"));
		email.elementvisiblity(admin);
	}
}
