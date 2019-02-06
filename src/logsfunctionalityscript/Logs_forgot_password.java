package logsfunctionalityscript;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.faveoadminpage;
import emailsettings.systemlogs;
import logsfunctionalitypage.Logs_Assign_ticket_page;
import logsfunctionalitypage.Logs_forgot_password_page;

public class Logs_forgot_password extends Basetest 
{
	@Test
	public void forgot_password() throws InterruptedException
	{
		//click on login button
		faveoadminpage login = new faveoadminpage(driver);
		login.clicklogin();
		Thread.sleep(3000);
		login.username(input.getdata(excel, "createticket", 0, 1));
		
		//click on forgot password
		Logs_forgot_password_page forgot=new Logs_forgot_password_page(driver);
		forgot.clickforgotpassword();
		
		//enter the mail id
		forgot.enter_the_email();
		
		//click on send
		forgot.clicksend();
		
		
		//click on home button
		forgot.clickhomebutton();
		
		//click on login and login as admin and check in systemlogs
		login.clicklogin();
		Thread.sleep(3000);
		login.username(input.getdata(excel, "createticket", 0, 1));
		login.passsword(input.getdata(excel, "createticket", 1, 1));
		login.clicklogin1();
		Thread.sleep(3000);
		login.clickAdminpanel();
		systemlogs logs=new systemlogs(driver);
		logs.systemlogsadminpage();
		Logs_Assign_ticket_page ticket=new Logs_Assign_ticket_page(driver);
		ticket.checkcategory();
		
		
	}

}
