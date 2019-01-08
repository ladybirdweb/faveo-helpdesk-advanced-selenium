package loginscriptviaregister;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic.Basetestloginviaregister;
import Generic.input;
import loginpage.loginViaRegister;

public class agentviaemail extends Basetestloginviaregister  
{
	@Test
	public void test()
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
}
