package logsfunctionalityscript;
import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.faveoadminpage;
import emailsettings.systemlogs;
import logsfunctionalitypage.Logs_create_ticket_page;
import logsfunctionalitypage.Logs_reply_as_agent_page;

public class Logs_reply_as_agent_script extends Basetest 
{
	@Test
	public void replyticket() throws InterruptedException
	{
		// login as agent	
		faveoadminpage Admin=new faveoadminpage(driver);
		Admin.clicklogin();
		Thread.sleep(3000);
		Admin.username(input.getdata(excel, "createticket", 0, 2));
		Admin.passsword(input.getdata(excel, "createticket", 1, 2));
		Admin.clicklogin1();
	
		//click on ticket
		Logs_reply_as_agent_page agent=new Logs_reply_as_agent_page(driver);
		Thread.sleep(4000);
		agent.clickoninbox();
	
		//click on created ticket
		Thread.sleep(3000);
		agent.clickonticket();
	
		//give description
		agent.givedescriptionreplyagent();
	
		//click update
		agent.clickupdate();
	
		//logout as agent 
		Logs_create_ticket_page ticket=new Logs_create_ticket_page(driver);
		Thread.sleep(50000);
	
		//click on logout when login as agent
		ticket.clicklogoutagent();
		ticket.clicklogoutbttn();
       
		
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
	    logs.checkticketreply();
	    
	    
	    
	}
}
