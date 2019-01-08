package loginscript;

import Generic.Basetestauthlogin;
import Generic.input;
import loginpage.authLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class authclient extends Basetestauthlogin   
{
	@Test
	public void Test1() throws InterruptedException
	{
		authLogin loginverifiedclient1=new authLogin(driver);
		loginverifiedclient1.authusername(input.getdata(excel, "sheet2", 28, 1));
		loginverifiedclient1.authpassword(input.getdata(excel, "sheet2", 29, 1));
		loginverifiedclient1.clcikauthloginbuttion();
		//driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		WebElement userverified1=driver.findElement(By.xpath("//span[text()='Submit a ticket']"));
		loginverifiedclient1.elementvisiblityuserverified(userverified1);
  	}
	
	public class authclientemail extends Basetestauthlogin 
	{
		@Test
		public void Test2() throws InterruptedException
		{
			authLogin loginverifiedclient2=new authLogin(driver);
			loginverifiedclient2.authusername(input.getdata(excel, "sheet2", 30, 1));
			loginverifiedclient2.authpassword(input.getdata(excel, "sheet2", 31, 1));
			loginverifiedclient2.clcikauthloginbuttion();
			Thread.sleep(2000);
			WebElement userverified2=driver.findElement(By.xpath("//span[text()='Submit a ticket']"));
			loginverifiedclient2.elementvisiblityuserverified(userverified2);
			Thread.sleep(2000);
	}
		
		
}
}
