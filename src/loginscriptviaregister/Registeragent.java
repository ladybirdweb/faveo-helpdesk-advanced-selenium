package loginscriptviaregister;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic.Basetestloginviaregister;
import Generic.input;
import loginpage.loginViaRegister;

public class Registeragent extends Basetestloginviaregister 
{
	//testcase for verifing the login via register for agent
	@Test(priority=1)
	public void Agentverified()
	{
		loginViaRegister verifiedagent=new loginViaRegister(driver);
		verifiedagent.clickregister();
		verifiedagent.clicklogin();
		verifiedagent.authusername(input.getdata(excel, "sheet2",12, 1));
		verifiedagent.authpassword(input.getdata(excel, "sheet2", 13, 1));
		verifiedagent.clickauthloginbuttion();
		WebElement agent=driver.findElement(By.xpath("//a[@onclick='clickDashboard(event);']"));
		verifiedagent.elementvisiblityagent(agent);
	}
	
	//testcase for verifying the login via register for agent
	@Test(priority=2)
	public void Agentverifiedemail()
	{
		loginViaRegister viaemail=new loginViaRegister(driver);
		viaemail.clickregister();
		viaemail.clicklogin();
		viaemail.authusername(input.getdata(excel, "sheet2", 20, 1));
		viaemail.authpassword(input.getdata(excel, "sheet2", 21, 1));
		viaemail.clickauthloginbuttion();
		WebElement agent=driver.findElement(By.xpath("//a[@onclick='clickDashboard(event);']"));
		viaemail.elementvisiblityagent(agent);
    }
	
	//test case for verifying the login via register for agentunverified
	@Test(priority=3)
	public void Agentunverified()
	{
		loginViaRegister unverified=new loginViaRegister(driver);
		unverified.clickregister();
		unverified.clicklogin();
		unverified.authusername(input.getdata(excel, "sheet2", 22, 1));
		unverified.authpassword(input.getdata(excel, "sheet2", 23, 1));
		unverified.clickauthloginbuttion();
	}
	
	//test case for verifying the login via register for agentban
	@Test(priority=4)
	public void Agentban()
	{
		loginViaRegister agban=new loginViaRegister (driver);
		agban.clickregister();
		agban.clicklogin();
		agban.authusername(input.getdata(excel, "sheet2", 24, 1));
		agban.authpassword(input.getdata(excel, "sheet2", 25, 1));
		agban.clickauthloginbuttion();
		WebElement BANN=driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
		agban.elementvisiblityagentban(BANN);
	}
	
	//test case for verifying the login via register for agentdeactivate
	@Test(priority=5)
	public void AgentDeactivate()
	{
		loginViaRegister agdeactivate=new loginViaRegister(driver);
		agdeactivate.clickregister();
		agdeactivate.clicklogin();
		agdeactivate.authusername(input.getdata(excel, "sheet2", 26, 1));
		agdeactivate.authpassword(input.getdata(excel, "sheet2",27 , 1));
		agdeactivate.clickauthloginbuttion();
		WebElement BANN=driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
		agdeactivate.elementvisiblityagentban(BANN);
	}
}
