package logsfunctionalitypage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Basepage;

public class Logsvisiblitycheck extends Basepage 
{
    //inspect dropdown systemlogs and debugging
	@FindBy(xpath="//span[text()='System Logs and debugging']")
	private WebElement systemlogsanddebuggingdropdown;
	
	//inspect the element within the dropdown
	@FindBy(xpath="//span[text()='System Logs']")
	private WebElement systemlogsdropdown;
	
	public Logsvisiblitycheck(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void systemlogsdropdown() throws InterruptedException
	{
	   Thread.sleep(3000);
		this.systemlogsanddebuggingdropdown.click();
	}
	
	public void redirectsystemlogs() throws InterruptedException
	{
		Thread.sleep(2000);
		this.systemlogsdropdown.click();
	}
}
