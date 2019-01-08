package loginscriptviaregister;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic.Basetestloginviaregister;
import Generic.input;
import loginpage.loginViaRegister;

public class clientunverified extends Basetestloginviaregister   
{
	@Test
	public void test()
	{
		loginViaRegister clientunverified=new loginViaRegister(driver);
		clientunverified.clickregister();
		clientunverified.clicklogin();
		clientunverified.authusername(input.getdata(excel, "sheet2", 36, 1));
		clientunverified.authpassword(input.getdata(excel, "sheet2", 37, 1));
		clientunverified.clickauthloginbuttion();
		WebElement userverified=driver.findElement(By.xpath("//span[@id='message']"));
		clientunverified.elementvisiblityuserverified(userverified);
	}

}
