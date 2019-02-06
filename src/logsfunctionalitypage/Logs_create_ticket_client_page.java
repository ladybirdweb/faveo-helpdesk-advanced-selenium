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

public class Logs_create_ticket_client_page extends Basepage 
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
	
	//click on submit
	@FindBy(xpath="//div[@class='row']//button[@class='btn btn-info']")
	private WebElement clicksubmitclient;
	
	//click on my profile
	@FindBy(xpath="//a[text()='My profile']")
	private WebElement clickmyprofile;
	
	//click on logout
	@FindBy(xpath="//div[@class='banner-content']//a[text()='Logout']")
	private WebElement clicklogout;
	
	//code for replying as a client
	
	//click on my tickets
	@FindBy(xpath="//*[@id=\"navbar\"]/nav/ul[1]/li[4]")
	private WebElement clickmyticketsclient;
	
	//click on the ticket
	@FindBy(xpath="//div[@class='site-content col-md-12']//a[text()='this is test ms... ']")
    private WebElement clickontheticketclient;
	
	//click on reply
	@FindBy(xpath="//i[@class='fa fa-reply-all']")
	private WebElement clickonreplycommentclient;
	
	public Logs_create_ticket_client_page(WebDriver driver) {
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
	}
	
	//method to click on my profile
	public void clickonmyprofileclient() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-1900)");
		this.clickmyprofile.click();
	}
	
	//method to click logout
	public void clicklogoutclient() throws InterruptedException
	{
		Thread.sleep(2500);
		this.clicklogout.click();
	}
	
	//reply for the client    (method)
	
	//click on my ticket
	public void clickonmyticketclient() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-1900)");
		this.clickmyticketsclient.click();
	}
	
	//click on the particular ticket
	public void clickonticketclient() throws InterruptedException
	{
		Thread.sleep(3500);
		this.clickontheticketclient.click();
	}
	
	//give the description for the client ticket
	public void givedescriptionticketclient() throws InterruptedException
	{
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,6900)");
		driver.findElement(By.xpath("//a[@class='cke_button cke_button__specialchar cke_button_off']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='T']")).click();
		driver.findElement(By.xpath("//span[@class='cke_button_icon cke_button__specialchar_icon']")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//a[@title='E']")).click();
		driver.findElement(By.xpath("//span[@class='cke_button_icon cke_button__specialchar_icon']")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//a[@title='S']")).click();
		driver.findElement(By.xpath("//span[@class='cke_button_icon cke_button__specialchar_icon']")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//a[@title='T']")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//span[@class='cke_button_icon cke_button__horizontalrule_icon']")).click();
		Thread.sleep(2500);
		
		Thread.sleep(3000);
		
	}
	
	//click on`reply
	public void clickreplyclientticketbutton()
	{
		this.clickonreplycommentclient.click();
	}
	
}
