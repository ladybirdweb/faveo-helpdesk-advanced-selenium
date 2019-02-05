package logsfunctionalityscript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import Generic.Basetest;
import Generic.input;
import Page.faveoadminpage;
import emailsettings.systemlogs;
import logsfunctionalitypage.createticket;
import logsfunctionalitypage.createticketclient;


public class scriptcreateticket extends Basetest 
{
	

	@Test(priority=1)
	public void createtickets() throws InterruptedException, AWTException
	{	
		//login as Admin
		
		faveoadminpage Admin=new faveoadminpage(driver);
		Admin.clicklogin();
        Admin.username(input.getdata(excel, "createticket", 0, 1));
        Admin.passsword(input.getdata(excel, "createticket", 1, 1));
		Admin.clicklogin1();
		
		//click on create ticket sidebar
		createticket ticket=new createticket(driver);
		ticket.clickcreateticket();
		
		//enter the requester
		ticket.clickrequester();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_V);
		Thread.sleep(3500);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		//select the dropdown for the requester
	List<WebElement> list=	driver.findElements(By.xpath("//ul[@class='dropdown-menu menu2']//li/descendant::p[@class='ng-binding']"));
	for(int i=0;i<list.size();i++)
	{
		if(list.get(i).getText().contains("  viratkohli@gmail.com"))
		{
			list.get(i).click();
		}
	}
	Thread.sleep(3500);
	
	//type the subject
	ticket.typesubject("this is a test ticket he ha aha a a");
	
	//select the status
	ticket.selectstatus();
	
	//select the priority
	ticket.selectpriority();
	
	//select the helptopic
	ticket.selecthelptopic();
	
	//select the department
	ticket.selectdepartment();
	
	//select the type
	ticket.selecttype();
	
	//type the description and click on submit
	ticket.givedescription();
	
	
	
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	//go to admin panel and click system logs
	Admin.clickAdminpanel();
	systemlogs logs=new systemlogs(driver);
	logs.systemlogsadminpage();
	
	//check with the subject for the system logs
	//Thread.sleep(2000);
	logs.click_on_subject();
	}
	
	//test case for creating the ticket in the agent panel
	@Test(priority=2)
	public void createticketagent() throws InterruptedException, AWTException
	{

		faveoadminpage Admin=new faveoadminpage(driver);
		Admin.clicklogin();
		Thread.sleep(3000);
        Admin.username(input.getdata(excel, "createticket", 0, 2));
        Admin.passsword(input.getdata(excel, "createticket", 1, 2));
		Admin.clicklogin1();
		
		//click on create ticket sidebar
		createticket ticket=new createticket(driver);
		ticket.clickcreateticket();
		
		//enter the requester
		ticket.clickrequester();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_V);
		Thread.sleep(3500);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		//select the dropdown for the requester
		List<WebElement> list=	driver.findElements(By.xpath("//ul[@class='dropdown-menu menu2']//li/descendant::p[@class='ng-binding']"));
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getText().contains("  viratkohli@gmail.com"))
			{
				list.get(i).click();
			}
		}
		Thread.sleep(3500);
		
		//type the subject
		ticket.typesubject("this is a test ticket he ha aha a a");
		
		//select the status
		ticket.selectstatus();
		
		//select the priority
		ticket.selectpriority();
		
		//select the helptopic
		ticket.selecthelptopic();
		
		//select the department
		ticket.selectdepartment();
		
		//select the type
		ticket.selecttype();
		
		//type the description and click on submit
		ticket.givedescription();
		
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		
		//click on logout when login as agent
		ticket.clicklogoutagent();
		
		ticket.clicklogoutbttn();
		
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		//login as admin
		Admin.clicklogin();
		Thread.sleep(2000);
        Admin.username(input.getdata(excel, "createticket", 0, 1));
        Admin.passsword(input.getdata(excel, "createticket", 1, 1));
		Admin.clicklogin1();
		
		//go to admin panel and click system logs
		Thread.sleep(3500);
		Admin.clickAdminpanel();
		systemlogs logs=new systemlogs(driver);
		logs.systemlogsadminpage();
		
		//check with the subject for the system logs
		//Thread.sleep(2000);
		logs.click_on_subject();
}
	@Test(priority=3)
	public void createticketclient() throws InterruptedException
	{
		//login as a client
		faveoadminpage Admin=new faveoadminpage(driver);
		Admin.clicklogin();
		Thread.sleep(3000);
        Admin.username(input.getdata(excel, "createticket", 0, 3));
        Admin.passsword(input.getdata(excel, "createticket", 1, 3));
        Thread.sleep(3000);
		Admin.clicklogin1();
		
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(3000);
		//click on submit the ticket
		createticketclient client=new createticketclient(driver);
		client.clicksubmitclient();
		
		//enter the subject
		client.typesubjectclient("this is test msg");
		
		//enter the priority
		client.selectpriorityclient();
		
		//enter the helptopic
		client.selecthelptopicclient();
		
		//enter the description
		client.givedescriptionclient();
		
		//click on my profile
		client.clickonmyprofileclient();
		
		//click on logout
		client.clicklogoutclient();
		
		//login as admin and check for system logs
		Admin.clicklogin();
		Thread.sleep(2000);
        Admin.username(input.getdata(excel, "createticket", 0, 1));
        Admin.passsword(input.getdata(excel, "createticket", 1, 1));
		Admin.clicklogin1();
		
		Thread.sleep(3500);
		Admin.clickAdminpanel();
		systemlogs logs=new systemlogs(driver);
		logs.systemlogsadminpage();
		
		logs.click_on_subject();
	}
	
	//register the user from the client panel

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
