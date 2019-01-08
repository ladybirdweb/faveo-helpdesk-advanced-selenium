package loginscriptviaregister;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic.Basetestloginviaregister;
import Generic.input;
import loginpage.loginViaRegister;

public class clientverifiedemail1  extends Basetestloginviaregister    
{
	@Test
	public void test()
	{
		loginViaRegister cle=new loginViaRegister(driver);
		cle.clickregister();
		cle.clicklogin();
		cle.authusername(input.getdata(excel, "sheet2", 34, 1));
		cle.authpassword(input.getdata(excel, "sheet2", 35, 1));
		cle.clickauthloginbuttion();
		WebElement userverified=driver.findElement(By.xpath("//span[text()='Submit a ticket']"));
		cle.elementvisiblityuserverified(userverified);
	}

}
