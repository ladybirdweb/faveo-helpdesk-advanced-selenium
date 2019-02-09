package logsfunctionalityscript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.faveoadminpage;
import emailsettings.systemlogs;
import logsfunctionalitypage.Logs_Assign_ticket_page;
import logsfunctionalitypage.Logs_create_ticket_client_page;

public class Check_ticket_client_script extends Basetest 
{
	@Test
	public void Checkticketstatus() throws InterruptedException
	{
		//login as client
		faveoadminpage Admin=new faveoadminpage(driver);
		Admin.clicklogin();
		Thread.sleep(3000);
        Admin.username(input.getdata(excel, "createticket", 0, 3));
        Admin.passsword(input.getdata(excel, "createticket", 1, 3));
        Thread.sleep(3000);
		Admin.clicklogin1();
		Thread.sleep(3000);
		
		//click on submit ticket
		Logs_create_ticket_client_page client=new Logs_create_ticket_client_page(driver);
		client.clicksubmitclient();
		Thread.sleep(3000);
		
		//enter the email
		driver.findElement(By.xpath("//div[@class='align']//input[@class='form-control']")).sendKeys("aamirkhan@gmail.com");
		Thread.sleep(3000);
		
		//enter the ticket number
		driver.findElement(By.xpath("//div[@class='align1']//input[@class='form-control']")).sendKeys("AAAA-0000-0219");
		Thread.sleep(3000);
		
		//click on submit button
		driver.findElement(By.xpath("//input[@class='btn btn-custom btn-info']")).click();
		Thread.sleep(3000);
		
		//click on my profile and click on logout
		Logs_create_ticket_client_page clientcheck=new Logs_create_ticket_client_page(driver);
		Thread.sleep(20000);
		clientcheck.clickonmyprofileclient();
		
		clientcheck.clicklogoutclient();
		
		Thread.sleep(10000);
		
		//login  and check in system logs
		faveoadminpage login = new faveoadminpage(driver);
		login.clicklogin();
		Thread.sleep(3000);
		login.username(input.getdata(excel, "createticket", 0, 1));
		login.passsword(input.getdata(excel, "createticket", 1, 1));
		login.clicklogin1();
		
		login.clickAdminpanel();
		systemlogs logs=new systemlogs(driver);
		logs.systemlogsadminpage();
		Logs_Assign_ticket_page ticket=new Logs_Assign_ticket_page(driver);
		ticket.checkcategory();
		
		
		
		
	}

}
