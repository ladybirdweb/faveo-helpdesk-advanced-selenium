package loginscriptviaregister;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic.Basetestloginviaregister;
import Generic.input;
import loginpage.loginViaRegister;

public class agentban extends Basetestloginviaregister 
{
	@Test
	public void test()
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

}
