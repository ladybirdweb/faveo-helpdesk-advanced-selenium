package scriptemailsettings;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import emailsettings.switchurll;
import loginpage.basiclogin;

public class switchurl extends Basetest  
{
	
	

	@Test(priority=1)
	public void testagent() throws InterruptedException, AWTException
	{
		basiclogin login=new basiclogin(driver);
		login.clicklogin();
		login.username(input.getdata(excel, "sheet4", 0, 1));
		login.passsword(input.getdata(excel, "sheet4", 1, 1));
		login.clicklogin1();
		//Thread.sleep(3500);
	    ((JavascriptExecutor)driver).executeScript("window.open('about:blank','_blank')");	
	   
	    ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	    driver.get("http://localhost/faveo-helpdesk-advance/public/system-logs");
	    WebElement ele=driver.findElement(By.xpath("//a[text()='Home']"));
	    switchurll url=new switchurll(driver);
	    url.homebuttonvisiblity(ele);
	   
		
			// ((JavascriptExecutor)driver).executeScript("window.open('about:blank','_blank')");	
		
	  //((JavascriptExecutor)driver).executeScript("window.open('about:blank','_blank')");
		
	}
	
	@Test(priority=2)
	public void testclient() throws InterruptedException 
	{
		basiclogin login=new basiclogin(driver);
		login.clicklogin();
		login.username(input.getdata(excel, "sheet4", 2, 1));
		login.passsword(input.getdata(excel, "sheet4", 3, 1));
		login.clicklogin1();
		
		 ((JavascriptExecutor)driver).executeScript("window.open('about:blank','_blank')");	
		    ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
		    driver.switchTo().window(tabs.get(1));
		   driver.get("http://localhost/faveo-helpdesk-advance/public/system-logs");	
		   WebElement ele=driver.findElement(By.xpath("//a[text()='Home']"));
		    switchurll url=new switchurll(driver);
		    url.homebuttonvisiblity(ele);
}
}

