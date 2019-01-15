package scriptemailsettings;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.faveoadminpage;
import emailsettings.createemail;

public class emailsettings3 extends Basetest 
{
	 @Test
	   public void test1() throws InterruptedException, AWTException
	   {
		   createemail email=new createemail(driver);
			faveoadminpage login = new faveoadminpage(driver);
			login.clicklogin();
			login.username(input.getdata(excel, "sheet1", 0, 1));
			login.passsword(input.getdata(excel, "sheet1", 1, 1));
			login.clicklogin1();
			login.clickAdminpanel();
			email.clickemailpanel();
			email.clickcreateemail();
			email.typeemail(input.getdata(excel, "sheet3", 17,1));
			email.typename(input.getdata(excel, "sheet3", 18, 1));
			email.typepassword(input.getdata(excel, "sheet3", 19, 1));
			Thread.sleep(2000);
			email.clickfetchingprotocol();
			Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		    WebElement e=driver.findElement(By.xpath("//div[@id='Host name']//div//input[@class='form-control']"));
			e.sendKeys("imap.gmail.com");
		    Thread.sleep(2000);
			email.port("993");
			email.clickssl();
			email.clicktransferprotocol();
			Thread.sleep(2500);
			email.outgoinghostname("smtp.gmail.com");
			email.outgoingportnumber("465");
			email.outgoingencryption();
			email.clickupdate();
			
	   }
	 
	 
	 
	 
	 
	 
	 
	 
}
