package logsfunctionalityscript;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import Generic.Basetest;
import Generic.input;
import Page.faveoadminpage;
import emailsettings.systemlogs;
import logsfunctionalitypage.Logsregisteruserpage;
public class Logsregisteruserscript extends Basetest 
{
	@Test(priority=1)
	public void Logsregisteruser() throws InterruptedException 
	{
		//click on register button
		Logsregisteruserpage reg=new Logsregisteruserpage(driver);
		reg.clickregisterbutton();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		reg.enterfirstname();
		reg.enterlname();
		reg.enteremail();
		reg.hitregister();
		Thread.sleep(50000);
		
		//switch to url 
		((JavascriptExecutor)driver).executeScript("window.open('about:blank','_blank')");	   
		ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
		driver.get("http://localhost/faveo-helpdesk-advance/public/");
		
		//click on login and check in logs
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
    	
    	//check for user create
    	logs.checkusercreate();
    }
}
