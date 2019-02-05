package logsfunctionalitypage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Generic.Basepage;

public class createticketclient extends Basepage 
{

	//click on submit ticket
	@FindBy(xpath="//span[text()='Submit a ticket']")
	private WebElement clickonsubmitticketclient;
	
	//type the subject
	@FindBy(xpath="//input[@name='textfied1']")
	private WebElement entertextclient;
	
	//select priority
	@FindBy(xpath="//select[@id='priority']")
	private WebElement selectpriorityclient;
	
	//select helptopic
	@FindBy(xpath="//select[@name='selected5']")
	private WebElement selecthelptopicclient;
	
	//give description
	//@FindBy(xpath="//span[@class='cke_button_icon cke_button__link_icon']")
	//private WebElement clickondescriptionagent;
	
	//click on submit
	@FindBy(xpath="//div[@class='row']//button[@class='btn btn-info']")
	private WebElement clicksubmitclient;
	
	//click on my profile
	@FindBy(xpath="//a[text()='My profile']")
	private WebElement clickmyprofile;
	
	//click on logout
	@FindBy(xpath="//div[@class='banner-content']//a[text()='Logout']")
	private WebElement clicklogout;
	

	public createticketclient(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
      
	//method for clicking on the submit ticket button 
	public void clicksubmitclient() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	  this.clickonsubmitticketclient.click();	
	}
	
	//method for typing the subject 
	public void typesubjectclient(String sub)
	{
		this.entertextclient.sendKeys(sub);
	}
	
	//select priority
	public void selectpriorityclient()
	{
		this.selectpriorityclient.click();
		Select selec=new Select(selectpriorityclient);
		selec.selectByVisibleText("High");
	}
	
	//select helptopic
	public void selecthelptopicclient()
	{
		this.selecthelptopicclient.click();
		Select selec=new Select(selecthelptopicclient);
		selec.selectByVisibleText("Support query");
	}
	
	//send text to the description
	public void givedescriptionclient() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1900)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='cke_button_icon cke_button__specialchar_icon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='T']")).click();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,1900)");
		Thread.sleep(2500);
		this.clicksubmitclient.click();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
	}
	
	//method to click on my profile
	public void clickonmyprofileclient() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		this.clickmyprofile.click();
	}
	
	//method to click logout
	public void clicklogoutclient() throws InterruptedException
	{
		Thread.sleep(2500);
		this.clicklogout.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
