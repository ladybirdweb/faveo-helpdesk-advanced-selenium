package loginscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic.Basetestauthlogin;
import Generic.input;
import loginpage.authLogin;

public class Authadmin extends Basetestauthlogin 
{
	//checking the testcase for Authadmin verified
	@Test(priority=1)
	public void Authadminverified() throws InterruptedException
	{
		authLogin adminverified=new authLogin(driver);
		
		adminverified.authusername(input.getdata(excel, "loginscript", 0, 1));
		adminverified.authpassword(input.getdata(excel, "loginscript", 1, 1));
		adminverified.clcikauthloginbuttion();
		WebElement adminpanel = driver.findElement(By.xpath("//a[text()='Admin Panel']"));
		adminverified.elementvisiblity1(adminpanel);	
	}

	//checking the testcase for Authadmin verified(email,numbers)
	@Test(priority=2)
	public void Authadminverifiedemailnum() throws InterruptedException
	{
		authLogin adminverified=new authLogin(driver);
		
		adminverified.authusername(input.getdata(excel, "loginscript", 4, 1));
		adminverified.authpassword(input.getdata(excel, "loginscript", 5, 1));
		adminverified.clcikauthloginbuttion();
		WebElement adminpanel = driver.findElement(By.xpath("//a[text()='Admin Panel']"));
		adminverified.elementvisiblity1(adminpanel);	
	}
	
	//checking the testcase for Authadmin verified (email,alphanumeric)
	@Test(priority=3)
	public void Authadminverifiedemailalphanumeric() throws InterruptedException
	{
		authLogin adminverified=new authLogin(driver);
		
		adminverified.authusername(input.getdata(excel, "loginscript", 6, 1));
		adminverified.authpassword(input.getdata(excel, "loginscript", 7, 1));
		adminverified.clcikauthloginbuttion();
		WebElement adminpanel = driver.findElement(By.xpath("//a[text()='Admin Panel']"));
		adminverified.elementvisiblity1(adminpanel);	
	}
	
	//checking the testcase for Authadmin ban
	@Test(priority=4)
	public void Authadminban() throws InterruptedException
	{
		authLogin adminverified=new authLogin(driver);
		adminverified.authusername(input.getdata(excel, "loginscript", 8, 1));
		adminverified.authpassword(input.getdata(excel, "loginscript", 9, 1));
		adminverified.clcikauthloginbuttion();
		WebElement BAN = driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
		adminverified.elementvisiblityban(BAN);
	}
	
	//checking the testcase for Authadmin deactivate
	@Test(priority=5)
	public void Test() throws InterruptedException
	{
		authLogin adminverified=new authLogin(driver);
		adminverified.authusername(input.getdata(excel, "loginscript", 10, 1));
		adminverified.authpassword(input.getdata(excel, "loginscript",11, 1));
		adminverified.clcikauthloginbuttion();
		WebElement BAN = driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
		adminverified.elementvisiblityban(BAN);	
	}
}
