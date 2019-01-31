package logsfunctionalityscript;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.faveoadminpage;

public class replyasagent extends Basetest 
{
	@Test
	public void replyticket() throws InterruptedException
	{
		
	faveoadminpage Admin=new faveoadminpage(driver);
	Admin.clicklogin();
	Thread.sleep(3000);
    Admin.username(input.getdata(excel, "createticket", 0, 2));
    Admin.passsword(input.getdata(excel, "createticket", 1, 2));
	Admin.clicklogin1();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
}
