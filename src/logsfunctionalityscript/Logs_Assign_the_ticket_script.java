package logsfunctionalityscript;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.faveoadminpage;
import emailsettings.systemlogs;
import logsfunctionalitypage.Logs_Assign_ticket_page;
import logsfunctionalitypage.Logs_reply_as_agent_page;

public class Logs_Assign_the_ticket_script extends Basetest 
{
	@Test
	public void assignTicket () throws InterruptedException
	{
		//login as admin 
		faveoadminpage login = new faveoadminpage(driver);
		login.clicklogin();
		Thread.sleep(3000);
		login.username(input.getdata(excel, "createticket", 0, 1));
		login.passsword(input.getdata(excel, "createticket", 1, 1));
		login.clicklogin1();

		//click on inbox
		Logs_reply_as_agent_page agent=new Logs_reply_as_agent_page(driver);
    	Thread.sleep(4000);
    	agent.clickoninbox();
	
		//click on created ticket
		Thread.sleep(3000);
		agent.clickonticket();
	    
		//click on assign to
		Logs_Assign_ticket_page ticket=new Logs_Assign_ticket_page(driver);
		ticket.clickonassign();
		
		//select the dropdown option
		ticket.clickonassigndropdown();
		
		//click on assignbutton
		ticket.clickonassignpopup();
		Thread.sleep(3500);
		
		//click on admin panel
		Thread.sleep(3000);
		login.clickAdminpanel();
		
		systemlogs logs=new systemlogs(driver);
		logs.systemlogsadminpage();
		ticket.checkcategory();
	
		
		//check within thesystem logs
		
		
	}
}


