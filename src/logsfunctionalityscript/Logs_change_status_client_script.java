package logsfunctionalityscript;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.faveoadminpage;
import emailsettings.systemlogs;
import logsfunctionalitypage.Logs_Assign_ticket_page;
import logsfunctionalitypage.Logs_change_status_client_page;
import logsfunctionalitypage.Logs_create_ticket_client_page;

public class Logs_change_status_client_script extends Basetest 
{
	@Test
	public void check_status_client() throws InterruptedException
	{
		//login as client
		faveoadminpage Admin=new faveoadminpage(driver);
		Admin.clicklogin();
		Thread.sleep(3000);
        Admin.username(input.getdata(excel, "createticket", 0, 3));
        Admin.passsword(input.getdata(excel, "createticket", 1, 3));
        Thread.sleep(3000);
		Admin.clicklogin1();
		
		//click my tickets
		Logs_change_status_client_page status=new Logs_change_status_client_page(driver);
		status.clickmyticketclient();
		
		//change status
		status.clickparticularticket();
		
		//click on change the status
		status.changestatus();
		
	    //click on that particular status
		status.selectstatus();
	
		
		//click on profile and click on logout
		Logs_create_ticket_client_page client=new Logs_create_ticket_client_page(driver);
		Thread.sleep(20000);
		client.clickonmyprofileclient();
		
		client.clicklogoutclient();
		
		Thread.sleep(10000);
		Admin.clicklogin();
		Thread.sleep(3000);
        Admin.username(input.getdata(excel, "createticket", 0, 1));
        Admin.passsword(input.getdata(excel, "createticket", 1, 1));
        Thread.sleep(3000);
		Admin.clicklogin1();
		Thread.sleep(3000);
		Admin.clickAdminpanel();
		
		//check in systemlogs
		systemlogs logs=new systemlogs(driver);
		logs.systemlogsadminpage();
		Thread.sleep(5000);
		Logs_Assign_ticket_page ticket=new Logs_Assign_ticket_page(driver);
		ticket.checkcategory();
		
	}

}
