package loginscriptviaregister;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic.Basetestloginviaregister;
import Generic.input;
import loginpage.loginViaRegister;

public class adminunverified extends Basetestloginviaregister
{
	@Test
	public void test()
	{
		loginViaRegister unverified=new loginViaRegister(driver);
		unverified.clickregister();
		unverified.clicklogin();
		unverified.authusername(input.getdata(excel, "sheet2", 6, 1));
		unverified.authpassword(input.getdata(excel, "sheet2", 7, 1));
		unverified.clickauthloginbuttion();
		WebElement admin=driver.findElement(By.xpath("//a[text()='Admin Panel']"));
		unverified.elementvisiblity(admin);
}
}
