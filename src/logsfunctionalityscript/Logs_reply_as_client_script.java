package logsfunctionalityscript;
import org.testng.annotations.Test;
import Generic.Basetest;
import Generic.input;
import Page.faveoadminpage;
import emailsettings.systemlogs;
import logsfunctionalitypage.Logs_create_ticket_client_page;


public class Logs_reply_as_client_script extends Basetest 
{
	@Test
	public void replyclient() throws InterruptedException
	{
		//login as client and create ticket
		faveoadminpage Admin=new faveoadminpage(driver);
		Admin.clicklogin();
		Thread.sleep(3000);
        Admin.username(input.getdata(excel, "createticket", 0, 3));
        Admin.passsword(input.getdata(excel, "createticket", 1, 3));
        Thread.sleep(3000);
		Admin.clicklogin1();
		Thread.sleep(3000);
		
		//click on submit the ticket
		Logs_create_ticket_client_page client=new Logs_create_ticket_client_page(driver);
		client.clicksubmitclient();
		
		//enter the subject
		client.typesubjectclient("this is test msg");
		
		//enter the priority
		client.selectpriorityclient();
		
		//enter the helptopic
		client.selecthelptopicclient();
		
		//enter the description
		client.givedescriptionclient();
		Thread.sleep(2000);
		
        //click on my ticket
		client.clickonmyticketclient();
		Thread.sleep(30000);
		
		//click on that particular ticket
		client.clickonticketclient();
		
		//give the reply message
		client.givedescriptionticketclient();
		
		//click on the reply button
		client.clickreplyclientticketbutton();
		Thread.sleep(50000);
		
		//click on profile and logout
		client.clickonmyprofileclient();
		
		client.clicklogoutclient();
		
		//login as admin and check in systemlogs
		
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
		logs.checkticketreply();
		
		
		
	}

}
