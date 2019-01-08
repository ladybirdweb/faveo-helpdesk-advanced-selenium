package loginscriptviaregister;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic.Basetestloginviaregister;
import Generic.input;
import loginpage.loginViaRegister;

public class clientverified extends Basetestloginviaregister   
{
	@Test
	public void test()
	{
		
	loginViaRegister clv=new loginViaRegister(driver);
	clv.clickregister();
	clv.clicklogin();
	clv.authusername(input.getdata(excel, "sheet2", 28, 1));
	clv.authpassword(input.getdata(excel, "sheet2",29 , 1));
	clv.clickauthloginbuttion();
	WebElement userverified=driver.findElement(By.xpath("//span[text()='Submit a ticket']"));
	clv.elementvisiblityuserverified(userverified);
	

}
}
