package emailsettings;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Generic.Basepage;

public class systemlogs extends Basepage 
{
    //systemlogs logo
	@FindBy(xpath="/html/body/div/div/section[2]/div[7]/div[2]/div/div/div[3]/div/div/a")
	private WebElement systemlogs;
	
	//check for breadcrumb
	@FindBy(xpath="//li[text()='System Logs']")
	private WebElement breadcrumbsystemlogs;
	
	//check for exceptionlogs heading
	@FindBy(xpath="//h3[text()='Exception logs']")
	private WebElement exceptionlogs;
	
	//check for deletelogsbutton
	@FindBy(xpath="//button[@id='log_delete']")
	private WebElement deletelogs;
	
	//click on exceptionlogs checkbox
	@FindBy(xpath="//input[@value='exception']")
	private WebElement clickexceptioncb;
	
	//click on date before
	@FindBy(xpath="//input[@placeholder='Select Date']")
	private WebElement checkdateafter;
	
	//click on date after
	@FindBy(xpath="//div[@id='log_delete_date2']//input[@placeholder='Select Date']")
    private WebElement checkdatebefore;	
	
	//click on delete button
	@FindBy(xpath="//button[@id='log_delete_btn']")
	private WebElement clcikdeletepopups;
	
	//click on croncheckbox
	@FindBy(xpath="//input[@value='cron']")
	private WebElement clickcroncb;
	
	//click on mail
	@FindBy(xpath="//input[@value='mail']")
	private WebElement clickemailcb;
	
	//logs category
	@FindBy(xpath="//div[@id='dynamic-select']")
	private WebElement logscategory;
	
	//check on cron date
	@FindBy(xpath="//*[@id=\"cron_date\"]/div/div/div[1]/input")
	private WebElement crondate;
	
	//check on cron date range
	@FindBy(xpath="//button[@class='mx-datepicker-btn mx-datepicker-btn-confirm']")
	private WebElement crondateok;
	
	//select date range
	@FindBy(xpath="//input[@placeholder='Select Date Range']")
	private WebElement Createddate;
	
	//select mail log sender
	@FindBy(xpath="//div[@id='sender-select-box']")
	private WebElement maillogssender;
	
	//select mail log reciver
	@FindBy(xpath="//*[@id=\"reciever-select-box\"]/div/div/div[1]/input")
    private WebElement maillogsreciver;	
	
	//check on cron logs
	@FindBy(xpath="//h3[@id='cron_logs_title']")
	private WebElement cronlogs;
	
	//click on subject
	@FindBy(xpath="//div[@index='1']//parent::td[@class='mail-subject']")
	private WebElement clciksubject;
	
	
	//check on mail logs
	@FindBy(xpath="//h3[@id='mail_logs_title']")
	private WebElement maillogs;
	
	
   
	//to initialize the constructor
	public systemlogs(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}

	//method for clicking the system logs
	public void systemlogsadminpage()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1900)");
		this.systemlogs.click();
	}
	
	//method for checking the breadcrumb
	public void checkbreadcrumb()
	{
		this.check_systemLogs_breadcrumb(breadcrumbsystemlogs);
	}

	//check for the exception logs visiblity
	public void checkexceptionlogs() throws InterruptedException 
	{
		this.exceptionlogselementvisiblity(exceptionlogs);
		Thread.sleep(2000);
	}
	
	//method for clicking the deletelog
	public void clickdeletelogs() throws InterruptedException
	{
		this.deletelogs.click();
		Thread.sleep(3000);
	}
	
	//check for the presence of the checkbox
	public void checkclickexception() throws InterruptedException
	{
		this.clickexceptioncb.click();
		System.out.println("the exception checkbox is clicked");
		Thread.sleep(3000);
	}
	
	//to pick the date from the logs
	public void popupdatepicker() throws InterruptedException
	{
		//pick the afterdate range
		this.checkdateafter.click();
		WebElement datepickafter=driver.findElement(By.xpath("//*[@id=\"log_delete_date1\"]/div/div/div[2]/div/div[2]/table/tbody/tr[3]/td[3]"));
		datepickafter.click();
		
		Thread.sleep(2000);
		//pick the aftertime range
		WebElement timepickafter=driver.findElement(By.xpath("//*[@id=\"log_delete_date1\"]/div/div/div[2]/div/div[2]/div[3]/ul/li[5]"));
		timepickafter.click();
		
		Thread.sleep(2000);
		//pick the beforedate range
		this.checkdatebefore.click();
		WebElement datepickbefore=driver.findElement(By.xpath("//*[@id=\"log_delete_date2\"]/div/div/div[2]/div/div[2]/table/tbody/tr[3]/td[4]"));
		datepickbefore.click();
		
		Thread.sleep(2000);
		//pick the before time range
		WebElement timepickbefore=driver.findElement(By.xpath("//*[@id=\"log_delete_date2\"]/div/div/div[2]/div/div[2]/div[3]/ul/li[4]"));
		timepickbefore.click();
	}
	
	//method for click cron(for deleting the cron mails)
	public void clickcroncb() throws InterruptedException
	{
		this.clickcroncb.click();
		System.out.println("the cron element is clicked");
		Thread.sleep(3500);
	}
	
	//mehtod to delete the mails from cron
	public void cronpopupdatepicker() throws InterruptedException
	{
	
		this.checkdateafter.click();
		WebElement crondatepickafter=driver.findElement(By.xpath("//*[@id=\"log_delete_date1\"]/div/div/div[2]/div/div[2]/table/tbody/tr[3]/td[3]"));
		crondatepickafter.click();
		
		Thread.sleep(2000);
		//pick the aftertime range
		WebElement crontimepickafter=driver.findElement(By.xpath("//*[@id=\"log_delete_date1\"]/div/div/div[2]/div/div[2]/div[3]/ul/li[5]"));
		crontimepickafter.click();
		
		Thread.sleep(2000);
		//pick the beforedate range
		this.checkdatebefore.click();
		WebElement crondatepickbefore=driver.findElement(By.xpath("//*[@id=\"log_delete_date2\"]/div/div/div[2]/div/div[2]/table/tbody/tr[3]/td[4]"));
		crondatepickbefore.click();
		
		Thread.sleep(2000);
		//pick the before time range
		WebElement crontimepickbefore=driver.findElement(By.xpath("//*[@id=\"log_delete_date2\"]/div/div/div[2]/div/div[2]/div[3]/ul/li[4]"));
		crontimepickbefore.click();
	}
	
	
	//method for maillogs
	public void clickmailcb() throws InterruptedException
	{
		this.clickemailcb.click();
		System.out.println("the mail checkbox is clicked");
		Thread.sleep(3500);
	}
	
	//method to pick the date for deleting the mail
	public void maildatepicker() throws InterruptedException
	{
		this.checkdateafter.click();
		WebElement maildatepickafter=driver.findElement(By.xpath("//*[@id=\"log_delete_date1\"]/div/div/div[2]/div/div[2]/table/tbody/tr[3]/td[3]"));
		maildatepickafter.click();
		
		Thread.sleep(2000);
		//pick the aftertime range
		WebElement mailtimepickafter=driver.findElement(By.xpath("//*[@id=\"log_delete_date1\"]/div/div/div[2]/div/div[2]/div[3]/ul/li[5]"));
		mailtimepickafter.click();
		
		Thread.sleep(2000);
		//pick the beforedate range
		this.checkdatebefore.click();
		WebElement maildatepickbefore=driver.findElement(By.xpath("//*[@id=\"log_delete_date2\"]/div/div/div[2]/div/div[2]/table/tbody/tr[3]/td[4]"));
		maildatepickbefore.click();
		
		Thread.sleep(2000);
		//pick the before time range
		WebElement mailtimepickbefore=driver.findElement(By.xpath("//*[@id=\"log_delete_date2\"]/div/div/div[2]/div/div[2]/div[3]/ul/li[4]"));
		mailtimepickbefore.click();
	}
	
	
	//click on delete popup
	public void clickdeletepopup() throws InterruptedException
	{
		this.clcikdeletepopups.click();
		Thread.sleep(3500);
	}
	
	//enter the category
	public void entercategorylog() throws AWTException, InterruptedException
	{
		this.logscategory.click();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_F);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
	}
	
	//check for the ticket create date
	public void ticketcreateddate() throws InterruptedException
	{
		//checking for the beforedate range
		this.Createddate.click();
		WebElement element=driver.findElement(By.xpath("//*[@id=\"Created date\"]/div/div/div[2]/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[3]"));
		element.click();
		
		Thread.sleep(2000);
		
		//checking the beforetime range
		WebElement element1=driver.findElement(By.xpath("//*[@id=\"Created date\"]/div/div/div[2]/div[2]/div[1]/div[2]/div[3]/ul/li[5]"));
		element1.click();
		
		Thread.sleep(2000);
		//check the after date range
		WebElement element2=driver.findElement(By.xpath("//*[@id=\"Created date\"]/div/div/div[2]/div[2]/div[2]/div[2]/table/tbody/tr[3]/td[5]"));
		element2.click();
		
		Thread.sleep(2000);
		//check the after time range
		WebElement element3=driver.findElement(By.xpath("//*[@id=\"Created date\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[3]/ul/li[6]"));
		element3.click();
		
		Thread.sleep(2000);
		
		//click on ok button
		WebElement element4=driver.findElement(By.xpath("//div[@class='row align_left']"));
		element4.click();
		
		Thread.sleep(2000);
			
	}
	
	//method for picking the cron date
	public void pickcrondate() throws InterruptedException
	{
		
		//seleting the date range
		this.crondate.click();
		WebElement element5=driver.findElement(By.xpath("//*[@id=\"cron_date\"]/div/div/div[2]/div[2]/div[1]/div[2]/table/tbody/tr[2]/td[3]"));
		element5.click();
		
		Thread.sleep(2000);
		
		//selecting the time range
		WebElement element6=driver.findElement(By.xpath("//*[@id=\"cron_date\"]/div/div/div[2]/div[2]/div[1]/div[2]/div[3]/ul/li[7]"));
		element6.click();
		
		Thread.sleep(2000);
		
		//selecting the date range
		WebElement element7=driver.findElement(By.xpath("//*[@id=\"cron_date\"]/div/div/div[2]/div[2]/div[2]/div[2]/table/tbody/tr[3]/td[4]"));
		element7.click();
		
		Thread.sleep(2000);
		
		//selecting the time range
		WebElement element8=driver.findElement(By.xpath("//*[@id=\"cron_date\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[3]/ul/li[6]"));
		element8.click();
		Thread.sleep(2000);
		
		//click on ok button
		WebElement element9=driver.findElement(By.xpath("//button[@class='mx-datepicker-btn mx-datepicker-btn-confirm']"));
		element9.click();
		
	}
	
	//select the mail log sender
	public void selectmaillogssender() throws AWTException, InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		this.maillogssender.click();
		Robot robot1 = new Robot();
		robot1.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot1.keyPress(KeyEvent.VK_TAB);
		
		Thread.sleep(2000);
		robot1.keyPress(KeyEvent.VK_ENTER);
		
	}
	
	public void click_on_subject() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2900)");
		Thread.sleep(3000);
		this.clciksubject.click();
	}
  
}
