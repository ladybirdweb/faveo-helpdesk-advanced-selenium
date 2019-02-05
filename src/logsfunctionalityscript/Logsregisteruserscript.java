package logsfunctionalityscript;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import Generic.Basetest;
import Generic.input;
import Page.faveoadminpage;
import emailsettings.systemlogs;
import logsfunctionalitypage.register;

public class registermail extends Basetest 
{
	@Test(priority=1)
	public void registeruser() throws InterruptedException
	{
	//registering the new user
	register reg=new register(driver);
	reg.clickregisterbutton();
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	reg.enterfirstname(input.getdata(excel,"registeruserclient", 0, 1));
	reg.enterlname(input.getdata(excel, "registeruserclient", 1, 1));
	reg.enteremail(input.getdata(excel, "registeruserclient", 2, 1));
	reg.hitregister();
	
	Thread.sleep(3500);
	}

	//after registration checking in the admin panel for the system logs
    @Test
    public void checkmail() throws InterruptedException
    {
	
	faveoadminpage login = new faveoadminpage(driver);
	login.clicklogin();
	Thread.sleep(3000);
	login.username(input.getdata(excel, "createticket", 0, 1));
	login.passsword(input.getdata(excel, "createticket", 1, 1));
	login.clicklogin1();
	Thread.sleep(3500);
	login.clickAdminpanel();
	
	
	//click on the systemlogs logo
	systemlogs logs=new systemlogs(driver);
	logs.systemlogsadminpage();
	
	//check within thesystem logs
	logs.click_on_subject();
	
}
}
