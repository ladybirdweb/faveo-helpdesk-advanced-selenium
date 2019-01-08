package loginscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic.Basetestauthlogin;
import Generic.input;
import loginpage.authLogin;

public class authagentverified extends Basetestauthlogin  
{
	@Test(priority=1)
	public void Test() throws InterruptedException
	{
		authLogin adminverified=new authLogin(driver);
		
		adminverified.authusername(input.getdata(excel, "sheet2", 22, 1));
		adminverified.authpassword(input.getdata(excel, "sheet2", 23, 1));
		adminverified.clcikauthloginbuttion();
		WebElement agent = driver.findElement(By.xpath("//a[@onclick='clickDashboard(event);']"));
		adminverified.elementvisiblityagent(agent);
		
		
	}

public class authagentban extends Basetestauthlogin
{
	@Test(priority=2)
	public void Test() throws InterruptedException
	{
		authLogin agentban=new authLogin(driver);
		agentban.authusername(input.getdata(excel, "sheet2",24 ,1 ));
		agentban.authpassword(input.getdata(excel, "sheet2", 25, 1));
		agentban.clcikauthloginbuttion();
		WebElement agentbandeactiv=driver.findElement(By.xpath("//div[@id='alert-message']"));
		agentban.elementvisiblityagentban(agentbandeactiv);
		
	}
}
}
