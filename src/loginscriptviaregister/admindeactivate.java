package loginscriptviaregister;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic.Basetestloginviaregister;
import Generic.input;
import loginpage.loginViaRegister;

public class admindeactivate extends Basetestloginviaregister
{
	@Test
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

