package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.notification;

public class Notification extends Basetest 
{
	@Test
	public void Test27()
	{
		notification notification=new notification(driver);
		notification.clicklogin();
		notification.username(input.getdata(excel, "sheet1", 0, 1));
		notification.passsword(input.getdata(excel, "sheet1", 1, 1));
		notification.clicklogin1();
		notification.clickAdminpanel();
		notification.clicknotification();
	}

}
