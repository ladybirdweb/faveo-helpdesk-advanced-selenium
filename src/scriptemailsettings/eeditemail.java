package scriptemailsettings;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.faveoadminpage;
import emailsettings.createemail;
import emailsettings.editemail;

public class eeditemail extends Basetest 
{
	 @Test
	   public void test1() throws InterruptedException
	   {
		
		 editemail edit=new editemail(driver);
		 createemail email=new createemail(driver);
			faveoadminpage login = new faveoadminpage(driver);
			login.clicklogin();
			login.username(input.getdata(excel, "sheet1", 0, 1));
			login.passsword(input.getdata(excel, "sheet1", 1, 1));
			login.clicklogin1();
			login.clickAdminpanel();
			email.clickemailpanel();
			edit.clickedit();
			edit.editpassword("asdfgh");
			email.clickupdate();
			Thread.sleep(2000);
			
	   }
	
}
