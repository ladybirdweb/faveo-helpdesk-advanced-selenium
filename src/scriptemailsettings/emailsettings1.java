package scriptemailsettings;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.faveoadminpage;
import emailsettings.createemail;

public class emailsettings1 extends Basetest 
{
	  @Test
	   public void test1() throws InterruptedException, AWTException
	   {
		   createemail email=new createemail(driver);
			faveoadminpage login = new faveoadminpage(driver);
			login.clicklogin();
			login.username(input.getdata(excel, "sheet1", 0, 1));
			login.passsword(input.getdata(excel, "sheet1", 1, 1));
			login.clicklogin1();
			login.clickAdminpanel();
			email.clickemailpanel();
			email.clickcreateemail();
			email.typeemail(input.getdata(excel, "sheet3", 12,1));
			email.typename(input.getdata(excel, "sheet3", 13, 1));
			email.typepassword(input.getdata(excel, "sheet3", 14, 1));
			email.clickfetchingprotocol();
			Thread.sleep(2000);
		    email.hostname("imap.gmail.com");
			Thread.sleep(2500);
			email.port("993");
				email.clickssl();
				email.clicktransferprotocol();
				Thread.sleep(2500);
				email.outgoinghostname("smtp.gmail.com");
				email.outgoingportnumber("465");
				email.outgoingencryption();
				email.clickupdate();
			
	   }

}
