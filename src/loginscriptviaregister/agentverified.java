package loginscriptviaregister;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic.Basetestloginviaregister;
import Generic.input;
import loginpage.loginViaRegister;

public class agentverified extends Basetestloginviaregister 
{
	@Test
	public void test()
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
}
