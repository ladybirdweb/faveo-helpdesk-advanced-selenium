package logsfunctionalityscript;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.faveoadminpage;
import Page.faveoagentpage;
import emailsettings.systemlogs;
import logsfunctionalitypage.Logs_Assign_ticket_page;

public class Change_password_script extends Basetest
{
	@Test
	public void change_password() throws InterruptedException
	{
		//login as admin
		faveoadminpage login = new faveoadminpage(driver);
		login.clicklogin();
		Thread.sleep(3000);
		login.username(input.getdata(excel, "createticket", 0, 1));
		login.passsword(input.getdata(excel, "createticket", 1, 1));
		login.clicklogin1();
		
		//click on admin panel and click on agent
		login.clickAdminpanel();
		
		faveoagentpage agent=new faveoagentpage(driver);
		agent.clickAgents();
		
		//click on view agent
		agent.clickviewagent();
		
		//click on change password
		agent.clickchangepassword();
		
		//enter the password
		agent.enternewpassword();
		
		//click on submit button
		agent.clicksubmitbutton();
		
		//click on admin panel and check in systemlogs
		login.clickAdminpanel();
		
		systemlogs logs=new systemlogs(driver);
		logs.systemlogsadminpage();
		Logs_Assign_ticket_page ticket=new Logs_Assign_ticket_page(driver);
		ticket.checkcategory();
	
	}
	

}
