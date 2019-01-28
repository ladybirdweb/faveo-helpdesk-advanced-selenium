package loginscript;

import Generic.Basetestauthlogin;
import Generic.input;
import loginpage.authLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Authclient extends Basetestauthlogin   
{
	//checking the testcase with Authclient(uname,pwd)
	@Test(priority=1)
	public void Authclientverified() throws InterruptedException
	{
		authLogin loginverifiedclient1=new authLogin(driver);
		loginverifiedclient1.authusername(input.getdata(excel, "loginscript", 28, 1));
		loginverifiedclient1.authpassword(input.getdata(excel, "loginscript", 29, 1));
		loginverifiedclient1.clcikauthloginbuttion();
		//driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		WebElement userverified1=driver.findElement(By.xpath("//span[text()='Submit a ticket']"));
		loginverifiedclient1.elementvisiblityuserverified(userverified1);
  	}
	
	//checking the testcase for Authclient (email,pwd)
		@Test(priority=2)
		public void Authclientverifiedemail() throws InterruptedException
		{
			authLogin loginverifiedclient2=new authLogin(driver);
			loginverifiedclient2.authusername(input.getdata(excel, "loginscript", 30, 1));
			loginverifiedclient2.authpassword(input.getdata(excel, "loginscript", 31, 1));
			loginverifiedclient2.clcikauthloginbuttion();
			Thread.sleep(2000);
			WebElement userverified2=driver.findElement(By.xpath("//span[text()='Submit a ticket']"));
			loginverifiedclient2.elementvisiblityuserverified(userverified2);
			Thread.sleep(2000);
	}
		
	//checking the testcase with AuthClient (email,number)
		@Test(priority=3)
		public void Authclientemailnumber() throws InterruptedException
		{
			authLogin loginverifiedclientemailnum=new authLogin(driver);
			loginverifiedclientemailnum.authusername(input.getdata(excel, "loginscript", 34, 1));
			loginverifiedclientemailnum.authpassword(input.getdata(excel, "loginscript", 35, 1));
			loginverifiedclientemailnum.clcikauthloginbuttion();
			Thread.sleep(2000);
			WebElement userverified2=driver.findElement(By.xpath("//span[text()='Submit a ticket']"));
			loginverifiedclientemailnum.elementvisiblityuserverified(userverified2);
			Thread.sleep(2000);
		}
		
	//checking the testcase with Authclient unverified
		@Test(priority=4)
		public void Authclientunverified() throws InterruptedException
		{
		authLogin loginunverifiedclient=new authLogin(driver);
		loginunverifiedclient.authusername(input.getdata(excel, "loginscript",36 ,1 ));
		loginunverifiedclient.authpassword(input.getdata(excel, "loginscript", 37, 1));
		loginunverifiedclient.clcikauthloginbuttion();
		WebElement userunverified=driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div"));
		loginunverifiedclient.elementvisiblityuserverified(userunverified);
		}
		
	//checking the testcase with Authclient ban	
		@Test(priority=5)
		public void Authclientban() throws InterruptedException
		{
			authLogin userban=new authLogin(driver);
			userban.authusername(input.getdata(excel, "loginscript", 38, 1));
			userban.authpassword(input.getdata(excel, "loginscript", 39, 1));
			userban.clcikauthloginbuttion();
			WebElement BANUSER=driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
			userban.userbann(BANUSER);	
		}
		
		//checking the testcase with Authclient deactivate
		@Test(priority=6)
		public void Authclientdeactivate() throws InterruptedException
		{
			authLogin userdeactivate =new authLogin(driver);
			userdeactivate.authusername(input.getdata(excel, "loginscript", 40, 1));
			userdeactivate.authpassword(input.getdata(excel, "loginscript",41 , 1));
			userdeactivate.clcikauthloginbuttion();
			WebElement BANUSER=driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
			userdeactivate.userbann(BANUSER);	
		}		
}

