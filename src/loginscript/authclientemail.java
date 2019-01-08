package loginscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic.Basetestauthlogin;
import Generic.input;
import loginpage.authLogin;

public class authclientemail extends Basetestauthlogin 
{
	@Test(priority=3)
	public void test() throws InterruptedException
	{
		authLogin loginverifiedclientemail=new authLogin(driver);
		loginverifiedclientemail.authusername(input.getdata(excel, "sheet2", 30, 1));
		loginverifiedclientemail.authpassword(input.getdata(excel, "sheet2", 31, 1));
		loginverifiedclientemail.clcikauthloginbuttion();
		Thread.sleep(2000);
		WebElement userverified2=driver.findElement(By.xpath("//span[text()='Submit a ticket']"));
		loginverifiedclientemail.elementvisiblityuserverified(userverified2);
		Thread.sleep(2000);
	}
	public class authclientemailnum extends Basetestauthlogin
	{
		@Test
		public void test() throws InterruptedException
		{
			authLogin loginverifiedclientemailnum=new authLogin(driver);
			loginverifiedclientemailnum.authusername(input.getdata(excel, "sheet2", 34, 1));
			loginverifiedclientemailnum.authpassword(input.getdata(excel, "sheet2", 35, 1));
			loginverifiedclientemailnum.clcikauthloginbuttion();
			Thread.sleep(2000);
			WebElement userverified2=driver.findElement(By.xpath("//span[text()='Submit a ticket']"));
			loginverifiedclientemailnum.elementvisiblityuserverified(userverified2);
			Thread.sleep(2000);
		}
	}
	public class authclientemailunverified extends Basetestauthlogin
	{
		@Test
		public void test() throws InterruptedException
		{
			authLogin loginunverifiedclient=new authLogin(driver);
		loginunverifiedclient.authusername(input.getdata(excel, "sheet2",36 ,1 ));
		loginunverifiedclient.authpassword(input.getdata(excel, "sheet2", 37, 1));
		loginunverifiedclient.clcikauthloginbuttion();
		WebElement userunverified=driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div"));
		loginunverifiedclient.elementvisiblityuserverified(userunverified);
		
		}
	}
}