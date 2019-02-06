package logsfunctionalityscript;
import org.testng.annotations.Test;
import Generic.Basetest;
import Generic.input;
import Page.faveoadminpage;
import Page.users;
import emailsettings.systemlogs;
import logsfunctionalitypage.Logs_Assign_ticket_page;

public class Logs_check_for_user_logs_agent_script extends Basetest 
{
  @Test
  public  void checkloguser() throws InterruptedException
  {
 
	    //login as admin 
		faveoadminpage login = new faveoadminpage(driver);
		login.clicklogin();
		Thread.sleep(3000);
		login.username(input.getdata(excel, "createticket", 0, 2));
		login.passsword(input.getdata(excel, "createticket", 1, 2));
		login.clicklogin1();
		Thread.sleep(3500);
	    
		//click on userdirectory
		users logsuser=new users(driver);
		logsuser.clickusers();
		
		//click on userdirectory
		logsuser.clickuserdirectory();
		
		//click on createuser
		logsuser.clickoncreateuser();
		
		//enter the firstname,lastname,email
		Thread.sleep(3000);
	    logsuser.enterfirstname();
	    
	    logsuser.enterlname();
	    
	    logsuser.enteremail();
	    
	    //click on submit button
	    logsuser.clicksubmituser();
	    
	   Thread.sleep(50000);
	    
	   //click on agentpanel
	    logsuser.clickagent();
	    
	    //click on logout
	    logsuser.clicklogout();
	    
	    //check on systemlogs
	    
	    //login as admin
		faveoadminpage Admin=new faveoadminpage(driver);
		Admin.clicklogin();
		Thread.sleep(3000);
        Admin.username(input.getdata(excel, "createticket", 0, 1));
        Admin.passsword(input.getdata(excel, "createticket", 1, 1));
		Admin.clicklogin1();
		
		Thread.sleep(3000);
		Admin.clickAdminpanel();
		
		//click on admin panel
		systemlogs logs=new systemlogs(driver);
		logs.systemlogsadminpage();
		Logs_Assign_ticket_page ticket=new Logs_Assign_ticket_page(driver);
		ticket.checkcategory();
		
		//check with the subject for the system logs
		//Thread.sleep(2000);
		
		
		
		
  }
}
