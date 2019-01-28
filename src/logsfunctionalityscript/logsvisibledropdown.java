package logsfunctionalityscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.faveoadminpage;
import emailsettings.systemlogs;
import logsfunctionalitypage.logsvisiblitycheck;

public class logsvisibledropdown extends Basetest 
{
	@Test(priority=1)
	public void logisvisibleadmin() throws InterruptedException
	{
		
		faveoadminpage login = new faveoadminpage(driver);
		login.clicklogin();
		login.username(input.getdata(excel, "sheet1", 0, 1));
		login.passsword(input.getdata(excel, "sheet1", 1, 1));
		login.clicklogin1();
		login.clickAdminpanel();
		
		
			
		
		//check the systemlogs dropdown
		logsvisiblitycheck check=new logsvisiblitycheck(driver);
		check.systemlogsdropdown();
		WebElement ele=driver.findElement(By.xpath("//span[text()='System Logs']"));
		check.checksystemlogs(ele);
	}
	@Test(priority=2)
	public void logisvisibleagent() throws InterruptedException
	{
		
		faveoadminpage login = new faveoadminpage(driver);
		login.clicklogin();
		login.username(input.getdata(excel, "sheet1", 0, 1));
		login.passsword(input.getdata(excel, "sheet1", 1, 1));
		login.clicklogin1();
		login.clickAdminpanel();
		
		//check the systemlogs dropdown
		Thread.sleep(3000);
		logsvisiblitycheck check=new logsvisiblitycheck(driver);
		check.systemlogsdropdown();
		//WebElement ele=driver.findElement(By.xpath("//span[text()='System Logs']"));
		//check.checksystemlogs(ele);
		check.redirectsystemlogs();
		systemlogs logs=new systemlogs(driver);
		logs.checkbreadcrumb();
	
	
}
}
