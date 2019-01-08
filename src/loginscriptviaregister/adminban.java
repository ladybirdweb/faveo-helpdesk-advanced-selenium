package loginscriptviaregister;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic.Basetestloginviaregister;
import Generic.input;
import loginpage.loginViaRegister;

public class adminban extends Basetestloginviaregister
{
	@Test
	public void test()
	{
		loginViaRegister adminban=new loginViaRegister(driver);
		adminban.clickregister();
		adminban.clicklogin();
		adminban.authusername(input.getdata(excel, "sheet2",8, 1));
		adminban.authpassword(input.getdata(excel, "sheet2", 9, 1));
		adminban.clickauthloginbuttion();
		WebElement BANN=driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
		adminban.elementvisiblityban(BANN);

}
}
