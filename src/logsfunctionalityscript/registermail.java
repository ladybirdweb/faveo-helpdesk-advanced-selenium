package logsfunctionalityscript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.faveoadminpage;
import emailsettings.systemlogs;
import logsfunctionalitypage.register;

public class registermail extends Basetest 
{
	@Test(priority=1)
	public void registeruser() throws InterruptedException
	{
	//registering the new user
	register reg=new register(driver);
	reg.clickregisterbutton();
	reg.enterfirstname(input.getdata(excel,"sheet5", 3, 1));
	reg.enterlname(input.getdata(excel, "sheet5", 4, 1));
	reg.enteremail(input.getdata(excel, "sheet5", 5, 1));
	reg.hitregister();
	
	Thread.sleep(3500);
	}

   
	//after registration checking in the admin panel for the system logs
    @Test(priority=2)
    public void checkmail()
    {
	
	faveoadminpage login = new faveoadminpage(driver);
	login.clicklogin();
	login.username(input.getdata(excel, "sheet1", 0, 1));
	login.passsword(input.getdata(excel, "sheet1", 1, 1));
	login.clicklogin1();
	login.clickAdminpanel();
	
	
	//click on the systemlogs logo
	systemlogs logs=new systemlogs(driver);
	logs.systemlogsadminpage();
	
	//checking for the mail logs for no matching records
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,1000)");
	WebElement ele=driver.findElement(By.xpath("//div[@class='mail-log-table']//tr[@class='VueTables__no-results']//td[text()='No matching records']"));
    logs.checkmailnomatchingrecords(ele);
}
}
