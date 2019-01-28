package scriptemailsettings;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import loginpage.basiclogin;

public class switchurlclient extends Basetest
{
	@Test
	public void test2() throws InterruptedException 
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
}
	
	
	
	
	
	
	
	
}
