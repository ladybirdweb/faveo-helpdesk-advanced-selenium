package loginscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic.Basetestauthlogin;
import Generic.input;
import loginpage.authLogin;

public class authadminban extends Basetestauthlogin  
{
	@Test
	public void Test() throws InterruptedException
	{
		authLogin adminverified=new authLogin(driver);
		
		adminverified.authusername(input.getdata(excel, "sheet2", 8, 1));
		adminverified.authpassword(input.getdata(excel, "sheet2", 9, 1));
		adminverified.clcikauthloginbuttion();
		WebElement BAN = driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
		adminverified.elementvisiblityban(BAN);
		
		
	}

}
