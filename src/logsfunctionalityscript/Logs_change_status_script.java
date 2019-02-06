package logsfunctionalityscript;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.faveoadminpage;
import emailsettings.systemlogs;
import logsfunctionalitypage.Logs_Assign_ticket_page;
import logsfunctionalitypage.Logs_reply_as_agent_page;

public class Logs_change_status_script extends Basetest 
{
	@Test
	public void changestatus() throws InterruptedException
	{
		//login as admin
		faveoadminpage login = new faveoadminpage(driver);
    	login.clicklogin();
    	Thread.sleep(3000);
    	login.username(input.getdata(excel, "createticket", 0, 1));
    	login.passsword(input.getdata(excel, "createticket", 1, 1));
    	login.clicklogin1();
    	
    	//check on inbox
    	Logs_reply_as_agent_page agent=new Logs_reply_as_agent_page(driver);
		Thread.sleep(4000);
		agent.clickoninbox();
	
		//click on created ticket
		Thread.sleep(3000);
		agent.clickonticket();
		
		//click on changestatus
		Logs_Assign_ticket_page change=new Logs_Assign_ticket_page(driver);
		change.clickchangestatus();
		
		//leave a comment
		change.entercomment();
		
		//click on yes
		change.clickyes();
		Thread.sleep(3000);
		
		//click on admin panel and check in system logs
		login.clickAdminpanel();
		systemlogs logs=new systemlogs(driver);
		logs.systemlogsadminpage();
		logs.checkticketupdate();
	

		
	}

}
