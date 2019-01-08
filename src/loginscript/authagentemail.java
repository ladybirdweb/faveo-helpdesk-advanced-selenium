package loginscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic.Basetestauthlogin;
import Generic.input;
import loginpage.authLogin;

public class authagentemail extends Basetestauthlogin  
{
	@Test
	public void Test() throws InterruptedException
	{
		authLogin adminverified=new authLogin(driver);
		
		adminverified.authusername(input.getdata(excel, "sheet2", 14, 1));
		adminverified.authpassword(input.getdata(excel, "sheet2", 15, 1));
		adminverified.clcikauthloginbuttion();
		WebElement agent = driver.findElement(By.xpath("//a[@onclick='clickDashboard(event);']"));
		adminverified.elementvisiblityagent(agent);
		
		
	}

}
