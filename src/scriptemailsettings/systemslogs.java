package scriptemailsettings;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.faveoadminpage;
import Page.logs;
import emailsettings.systemlogs;

public class systemslogs extends Basetest 
{
	//checking the delete exception
	@Test(priority=1)
	public void TestDeleteException() throws InterruptedException
	{
		faveoadminpage login = new faveoadminpage(driver);
		login.clicklogin();
		login.username(input.getdata(excel, "sheet1", 0, 1));
		login.passsword(input.getdata(excel, "sheet1", 1, 1));
		login.clicklogin1();
		login.clickAdminpanel();
		
		
		//click on the systemlogs logo
		systemlogs logs=new systemlogs(driver);
		logs.systemlogs();
		
	    //check wether the system logs page is present
		logs.checkbreadcrumb();
		
		//click on delete logs
		logs.clickdeletelogs();
		
		//clcik on exceptioncheckbox
		logs.checkclickexception();
		
		//select date to delete the exception
		logs.popupdatepicker();
		
		//delete the exception
		logs.clickdeletepopup();
		
		Thread.sleep(3000);
		
		
		
	}
	//test for deleting the cron
	@Test(priority=2)
	public void TestDeleteCron() throws InterruptedException
	{
		faveoadminpage login = new faveoadminpage(driver);
		login.clicklogin();
		login.username(input.getdata(excel, "sheet1", 0, 1));
		login.passsword(input.getdata(excel, "sheet1", 1, 1));
		login.clicklogin1();
		login.clickAdminpanel();
		
		
		//click on the systemlogs logo
		systemlogs logs=new systemlogs(driver);
		logs.systemlogs();
		
		//click on delete logs
		logs.clickdeletelogs();
		
		//click on cron checkbox
		logs.clickcroncb();
		
		logs.cronpopupdatepicker();
		
		//click on deletebutton
		logs.clickdeletepopup();
		
		Thread.sleep(3000);	
	}
	
	//testing for deleting the mail
	@Test(priority=3)
	public void TestDeleteMail() throws InterruptedException
	{
		faveoadminpage login = new faveoadminpage(driver);
		login.clicklogin();
		login.username(input.getdata(excel, "sheet1", 0, 1));
		login.passsword(input.getdata(excel, "sheet1", 1, 1));
		login.clicklogin1();
		login.clickAdminpanel();
		
		
		//click on the systemlogs logo
		systemlogs logs=new systemlogs(driver);
		logs.systemlogs();
		
		//click on delete logs
		logs.clickdeletelogs();	
		
		//click on mail checkbox
		logs.clickmailcb();
		
		//to pick the date for deleting the mail
		logs.maildatepicker();
		
		//click on deletebutton
		logs.clickdeletepopup();
		
		Thread.sleep(3500);
	}
	
	//test logs category
	@Test(priority=4)
	public void TestCheckLogsCategory() throws AWTException, InterruptedException
	{
		faveoadminpage login = new faveoadminpage(driver);
		login.clicklogin();
		login.username(input.getdata(excel, "sheet1", 0, 1));
		login.passsword(input.getdata(excel, "sheet1", 1, 1));
		login.clicklogin1();
		login.clickAdminpanel();
		
		
	
		systemlogs logs=new systemlogs(driver);
		logs.systemlogs();
		
		//check for the presence of the element
		 logs.entercategorylog();
			
			Thread.sleep(2000);
	}
	
	//test for the picking up the logs create date
	@Test(priority=5)
	public void TestCheckLogsCreateddate() throws InterruptedException
	{
		faveoadminpage login = new faveoadminpage(driver);
		login.clicklogin();
		login.username(input.getdata(excel, "sheet1", 0, 1));
		login.passsword(input.getdata(excel, "sheet1", 1, 1));
		login.clicklogin1();
		login.clickAdminpanel();
		
		
		//click on the systemlogs logo
		systemlogs logs=new systemlogs(driver);
		logs.systemlogs();
		
		//picking the logs create date
		logs.ticketcreateddate();
		
		Thread.sleep(2000);
			
	}
	
	//checking for the element visiblity for the cron logs
	@Test(priority=6)
	public void TestCheckcronlogs() throws InterruptedException
	{
		faveoadminpage login = new faveoadminpage(driver);
		login.clicklogin();
		login.username(input.getdata(excel, "sheet1", 0, 1));
		login.passsword(input.getdata(excel, "sheet1", 1, 1));
		login.clicklogin1();
		login.clickAdminpanel();
		
		
		//click on the systemlogs logo
		systemlogs logs=new systemlogs(driver);
		logs.systemlogs();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		logs.cronelementvisiblity(driver.findElement(By.xpath("//h3[@id='cron_logs_title']")));
	        Thread.sleep(3000);
	}
	
	//checking for the picking up the cron date
	@Test(priority=7)
	public void Testpickcrondate() throws InterruptedException
	{
		faveoadminpage login = new faveoadminpage(driver);
		login.clicklogin();
		login.username(input.getdata(excel, "sheet1", 0, 1));
		login.passsword(input.getdata(excel, "sheet1", 1, 1));
		login.clicklogin1();
		login.clickAdminpanel();
		
		
		//click on the systemlogs logo
		systemlogs logs=new systemlogs(driver);
		logs.systemlogs();
		
		//scrolling for picking  of the cron date
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		logs.pickcrondate();
		
	}
	
	//checking the element visiblity for  the maillogs
	@Test(priority=8)
	public void TestCheckMaillogs()
	{
		faveoadminpage login = new faveoadminpage(driver);
		login.clicklogin();
		login.username(input.getdata(excel, "sheet1", 0, 1));
		login.passsword(input.getdata(excel, "sheet1", 1, 1));
		login.clicklogin1();
		login.clickAdminpanel();
		
		
		//click on the systemlogs logo
		systemlogs logs=new systemlogs(driver);
		logs.systemlogs();
		
		JavascriptExecutor jsemail = (JavascriptExecutor) driver;
		jsemail.executeScript("window.scrollBy(0,1000)");
		logs.email_logs_elementvisiblity(driver.findElement(By.xpath("//h3[@id='mail_logs_title']")));

	}
	
	//selecting the mail sender from the mail logs
	@Test
	public void TestCheckMailsender() throws AWTException, InterruptedException
	{

		faveoadminpage login = new faveoadminpage(driver);
		login.clicklogin();
		login.username(input.getdata(excel, "sheet1", 0, 1));
		login.passsword(input.getdata(excel, "sheet1", 1, 1));
		login.clicklogin1();
		login.clickAdminpanel();
		
		
		//click on the systemlogs logo
		systemlogs logs=new systemlogs(driver);
		logs.systemlogs();
		
		//select the mail logs sender
		logs.selectmaillogssender();
		
		Thread.sleep(2000);
		
		
		
		//select the mail logs reciver
		//logs.selectmaillogreciver();
	}
}


	
	
	
	


