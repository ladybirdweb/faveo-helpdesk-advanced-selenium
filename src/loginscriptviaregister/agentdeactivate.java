package loginscriptviaregister;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic.Basetestloginviaregister;
import Generic.input;
import loginpage.loginViaRegister;

public class agentdeactivate extends  Basetestloginviaregister  
{
	@Test
	public void test()
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
