package loginscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic.Basetestauthlogin;
import Generic.input;
import loginpage.authLogin;

public class authuserbandeactivate extends Basetestauthlogin 
{
	@Test
	public void test() throws InterruptedException
	{
		authLogin userban=new authLogin(driver);
		userban.authusername(input.getdata(excel, "sheet2", 38, 1));
		userban.authpassword(input.getdata(excel, "sheet2", 39, 1));
		userban.clcikauthloginbuttion();
		WebElement BANUSER=driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
		userban.userbann(BANUSER);
		
	}
	public class authuserdeactivate extends Basetestauthlogin
	{
		@Test
		public void test() throws InterruptedException
		{
			authLogin userdeactivate =new authLogin(driver);
			userdeactivate.authusername(input.getdata(excel, "sheet2", 40, 1));
			userdeactivate.authpassword(input.getdata(excel, "sheet2",41 , 1));
			userdeactivate.clcikauthloginbuttion();
			WebElement BANUSER=driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
			userdeactivate.userbann(BANUSER);
			
		}
	}

}
