package loginscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic.Basetestauthlogin;
import Generic.input;
import loginpage.authLogin;

public class Authagent extends Basetestauthlogin  
{
	//checking the testcase for Agentverified
	@Test(priority=1)
	public void Authagentverified() throws InterruptedException
	{
		authLogin adminverified=new authLogin(driver);
		adminverified.authusername(input.getdata(excel, "loginscript", 14, 1));
		adminverified.authpassword(input.getdata(excel, "loginscript", 15, 1));
		adminverified.clcikauthloginbuttion();
		WebElement agent = driver.findElement(By.xpath("//a[@onclick='clickDashboard(event);']"));
		adminverified.elementvisiblityagent(agent);	
	}

	//checking the testcase for Agentverified (email,pwd)
	@Test(priority=2)
	public void Authagentemailpwd() throws InterruptedException
	{
		authLogin adminverified=new authLogin(driver);
		adminverified.authusername(input.getdata(excel, "loginscript", 18, 1));
		adminverified.authpassword(input.getdata(excel, "loginscript", 19, 1));
		adminverified.clcikauthloginbuttion();
		WebElement agent = driver.findElement(By.xpath("//a[@onclick='clickDashboard(event);']"));
		adminverified.elementvisiblityagent(agent);	
	}
	
	//checking the testcase for Agentverified(email ,numbers)
	@Test(priority=3)
	public void Authagentemailnum() throws InterruptedException
	{
		authLogin adminverified=new authLogin(driver);
		
		adminverified.authusername(input.getdata(excel, "loginscript", 22, 1));
		adminverified.authpassword(input.getdata(excel, "loginscript", 23, 1));
		adminverified.clcikauthloginbuttion();
		WebElement agent = driver.findElement(By.xpath("//a[@onclick='clickDashboard(event);']"));
		adminverified.elementvisiblityagent(agent);
	}
    
	//checking the testcase for Agent ban
	@Test(priority=4)
	public void Authagentban() throws InterruptedException
	{
		authLogin agentban=new authLogin(driver);
		agentban.authusername(input.getdata(excel, "loginscript",24 ,1 ));
		agentban.authpassword(input.getdata(excel, "loginscript", 25, 1));
		agentban.clcikauthloginbuttion();
		WebElement agentbandeactiv=driver.findElement(By.xpath("//div[@id='alert-message']"));
		agentban.elementvisiblityagentban(agentbandeactiv);
	}
}
