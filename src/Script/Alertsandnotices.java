package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.alertsandnotices;

public class Alertsandnotices extends Basetest 
{
@Test
public void Test14()
{
	alertsandnotices notices=new alertsandnotices(driver);
	notices.clicklogin();
	notices.username(input.getdata(excel, "sheet1", 0, 1));
	notices.passsword(input.getdata(excel, "sheet1", 1, 1));
	notices.clicklogin1();
	notices.clickAdminpanel();
	notices.clickalertsandnotices();
	
}
}
