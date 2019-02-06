package logsfunctionalityscript;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.faveoadminpage;
import emailsettings.systemlogs;
import logsfunctionalitypage.Apply_approval_Workflow_page;
import logsfunctionalitypage.Logs_Assign_ticket_page;
import logsfunctionalitypage.Logs_reply_as_agent_page;

public class Apply_approvalworkflow_script extends Basetest
{
	@Test
	public void Applyapprovalworkflow() throws InterruptedException, AWTException
	{
		//login as admin 
		faveoadminpage login = new faveoadminpage(driver);
		login.clicklogin();
		Thread.sleep(3000);
		login.username(input.getdata(excel, "createticket", 0, 1));
		login.passsword(input.getdata(excel, "createticket", 1, 1));
		login.clicklogin1();
		Thread.sleep(3000);
		login.clickAdminpanel();
		
		//click on approval workflow
		Apply_approval_Workflow_page workflo=new Apply_approval_Workflow_page(driver);
		workflo.clickapproval();
		
		//click on create approval workflow
		workflo.clickcreateapprovalworkflow();
		
		//give the approval workflow name
		Thread.sleep(3000);
		workflo.typeapprovalworkflowname();
		
		//give the status on approve
		workflo.selectstatusonapprove();
		
		//give the status on deny
		workflo.selectstatusondeny();
		
		//give the level1 name
		workflo.selectlevel_1name();
		
		//select the matcher
		workflo.selectmatcher();
		
		//select the users
		workflo.selectusers();
		
		//click on save button
		workflo.clicksavebtn();
		
		//click on agent
		workflo.clickagent();
		
		//click on inbox
		Logs_reply_as_agent_page agent=new Logs_reply_as_agent_page(driver);
		Thread.sleep(4000);
		agent.clickoninbox();

		//click on created ticket
		Thread.sleep(3500);
		agent.clickonticket();
		
		//apply approval workflow 
		workflo.clickapplyapprovalflow();
		
		//enter the text for applying workflow
		workflo.typeapprovalworkflow();
		
		//click on apply
		workflo.clickapply();
		Thread.sleep(50000);
    
		
		//click on admin panel and check in system logs
		login.clickAdminpanel();
		
		systemlogs logs=new systemlogs(driver);
		logs.systemlogsadminpage();
		Logs_Assign_ticket_page ticket=new Logs_Assign_ticket_page(driver);
		ticket.checkcategory();
		
	
	}
}
