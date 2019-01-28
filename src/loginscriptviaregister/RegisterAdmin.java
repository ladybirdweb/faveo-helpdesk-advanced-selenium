package loginscriptviaregister;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic.Basetestloginviaregister;
import Generic.input;
import loginpage.loginViaRegister;

public class RegisterAdmin extends Basetestloginviaregister 
{
	//checking the testcase with login via register Admin
	@Test(priority=1)
	public void Adminverified()
	{
		loginViaRegister adminverified=new loginViaRegister(driver);
		adminverified.clickregister();
		adminverified.clicklogin();
		adminverified.authusername(input.getdata(excel, "loginscript", 0, 1));
		adminverified.authpassword(input.getdata(excel, "loginscript", 1, 1));
		adminverified.clickauthloginbuttion();
		WebElement admin=driver.findElement(By.xpath("//a[text()='Admin Panel']"));
		adminverified.elementvisiblity(admin);
	}
	
	//checking the testcase with login via register Admin(email,pwd)
	@Test(priority=2)
	public void Adminverifiedemailpwd()
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
	
	//checking the testcase with login via register Adminunverified
	@Test(priority=3)
	public void Adminunverified()
	{
		loginViaRegister unverified=new loginViaRegister(driver);
		unverified.clickregister();
		unverified.clicklogin();
		unverified.authusername(input.getdata(excel, "sheet2", 6, 1));
		unverified.authpassword(input.getdata(excel, "sheet2", 7, 1));
		unverified.clickauthloginbuttion();
		WebElement admin=driver.findElement(By.xpath("//a[text()='Admin Panel']"));
		unverified.elementvisiblity(admin);
    }
	
	//checking the testcase with login via register Adminban
	@Test(priority=4)
	public void Adminban()
	{
		loginViaRegister adminban=new loginViaRegister(driver);
		adminban.clickregister();
		adminban.clicklogin();
		adminban.authusername(input.getdata(excel, "sheet2",8, 1));
		adminban.authpassword(input.getdata(excel, "sheet2", 9, 1));
		adminban.clickauthloginbuttion();
		WebElement BANN=driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
		adminban.elementvisiblityban(BANN);
    }
     
	//checking the testcase with login via register admindeacivate
	@Test(priority=5)
	public void test()
	{
		loginViaRegister deactivate=new loginViaRegister(driver);
		deactivate.clickregister();
		deactivate.clicklogin();
		deactivate.authusername(input.getdata(excel, "sheet2",10 ,1 ));
		deactivate.authpassword(input.getdata(excel, "sheet2", 11, 1));
		deactivate.clickauthloginbuttion();
		WebElement BANN=driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
		deactivate.elementvisiblityban(BANN);
	}
}
