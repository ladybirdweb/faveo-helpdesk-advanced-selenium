package loginscriptviaregister;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic.Basetestloginviaregister;
import Generic.input;
import loginpage.loginViaRegister;

public class RegisterClient extends Basetestloginviaregister   
{
	//checking the test case for the client verified
	@Test(priority=1)
	public void clientverified()
	{
	loginViaRegister clv=new loginViaRegister(driver);
	clv.clickregister();
	clv.clicklogin();
	clv.authusername(input.getdata(excel, "sheet2", 28, 1));
	clv.authpassword(input.getdata(excel, "sheet2",29 , 1));
	clv.clickauthloginbuttion();
	WebElement userverified=driver.findElement(By.xpath("//span[text()='Submit a ticket']"));
	clv.elementvisiblityuserverified(userverified);	
}
	//checking the testcase for the client verified (email,pwd)
	@Test(priority=2)
	public void Clientverifiedemailpwd()
	{
		loginViaRegister cle=new loginViaRegister(driver);
		cle.clickregister();
		cle.clicklogin();
		cle.authusername(input.getdata(excel, "sheet2", 34, 1));
		cle.authpassword(input.getdata(excel, "sheet2", 35, 1));
		cle.clickauthloginbuttion();
		WebElement userverified=driver.findElement(By.xpath("//span[text()='Submit a ticket']"));
		cle.elementvisiblityuserverified(userverified);
	}
	
	//checking the testcase for the client unverified
	@Test(priority=3)
	public void Clientunverified()
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
	
	//checking the test case for client ban
	@Test(priority=4)
	public void Clientban()
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
	
	//checking the testcase for client deactivate

	@Test(priority=5)
	public void Clientdeactivate()
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
