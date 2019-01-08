package loginscriptviaregister;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic.Basetestloginviaregister;
import Generic.input;
import loginpage.loginViaRegister;

public class userban extends Basetestloginviaregister 
{
	@Test
	public void test()
	{
		loginViaRegister usb=new loginViaRegister(driver);
		usb.clickregister();
		usb.clicklogin();
		usb.authusername(input.getdata(excel, "sheet2", 38, 1));
		usb.authpassword(input.getdata(excel, "sheet2",39, 1));
		usb.clickauthloginbuttion();
		WebElement BAN=driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
		usb.userbann(BAN);
	}
}
