package logsfunctionalityscript;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.faveoadminpage;
import emailsettings.systemlogs;
import logsfunctionalitypage.Logs_Assign_ticket_page;
import logsfunctionalitypage.Logs_reply_as_agent_page;

public class Apply_billing_check_script_chrome extends Basetest
{
	@Test
	public void Apply_billing_check() throws InterruptedException, AWTException
	{
		//login as admin 
		faveoadminpage login = new faveoadminpage(driver);
		login.clicklogin();
		Thread.sleep(3000);
		login.username(input.getdata(excel, "createticket", 0, 1));
		login.passsword(input.getdata(excel, "createticket", 1, 1));
		login.clicklogin1();
		Thread.sleep(3000);

        //click on inbox		
		Logs_reply_as_agent_page agent=new Logs_reply_as_agent_page(driver);
    	Thread.sleep(4000);
    	agent.clickoninbox();
	
	    //double click on ticket
    	//Thread.sleep(3500);
        Actions action = new Actions(driver);
    	WebElement element=driver.findElement(By.xpath("//div[@id='app-agent']//span[@data-pjax='220']"));
    	//action.doubleClick(element).perform();
    
    	((JavascriptExecutor)driver).executeScript("arguments[0].doubleClick();", element);
    	
    	//click on bill
    	Thread.sleep(3500);
    	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3950)");
    	driver.findElement(By.xpath("//ul[@class='nav nav-tabs']//a[@href='#bill']")).click();
    	
    	
    	//click on send invoice
    	Thread.sleep(3500);
    	driver.findElement(By.xpath("//div[@class='col-sm-3 pull-right']//a[@class='btn btn-primary']")).click();
    	
    	Thread.sleep(25000);
    	
    	//click on admin panel and check in system logs
        login.clickAdminpanel();
		
		systemlogs logs=new systemlogs(driver);
		logs.systemlogsadminpage();
		Logs_Assign_ticket_page ticket=new Logs_Assign_ticket_page(driver);
		ticket.checkcategory();
	
		
	}


}
