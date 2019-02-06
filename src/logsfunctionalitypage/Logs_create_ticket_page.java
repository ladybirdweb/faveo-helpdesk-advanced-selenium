package logsfunctionalitypage;
import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Generic.Basepage;


public class Logs_create_ticket_page extends Basepage 
{
	//click on create ticket
	@FindBy(xpath="/html/body/div[1]/aside[1]/section/ul/li[2]/a")
	private WebElement sidebarcreateticket;

	//click on requester 
	@FindBy(xpath="//input[@name='reqMail']")
	private WebElement click_on_requester;
	
	//type requester usernamename
	@FindBy(xpath="//input[@id='clientreq']")
	private WebElement requesteruname;

	//type requester name
	@FindBy(xpath="//input[@name='requsName0']")
	private WebElement typename;
 
	//type email
	@FindBy(xpath="//input[@name='requsEmail0']")
	private WebElement typeemail;

	//type mobile
	@FindBy(xpath="//input[@name='requsMobile0']")
	private WebElement mobile;

	//type subject
	@FindBy(xpath="//input[@name='textfiel1']")
	private WebElement subject;

	//select satatus
	@FindBy(xpath="//select[@id='status']")
	private WebElement status;

	//select priority
	@FindBy(xpath="//select[@id='priority']")
	private WebElement clickpriority;

	//select helptopic
	@FindBy(xpath="//select[@name='selected5']")
	private WebElement clickhelptopic;

	//select department
	@FindBy(xpath="//select[@name='selected6']")
	private WebElement selectdepartment;

	//select type
	@FindBy(xpath="//select[@name='selected7']")
	private WebElement selecttype;

	//click submit
	@FindBy(xpath="//button[@id='submitForm']")
	private WebElement clicksubmit;

	//click on logout when login as agent
	@FindBy(xpath="//li[@class='dropdown user user-menu']")
	private WebElement logoutagent;

	@FindBy(xpath="//a[@class='btn btn-danger btn-sm']")
	private WebElement clickonlogoutbtn;
	
	public Logs_create_ticket_page(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}

	//method for clicking the create ticket
	public void clickcreateticket() throws InterruptedException
	{
		Thread.sleep(4500);
		this.sidebarcreateticket.click();
	}

	//method for clicking the requester
	public void clickrequester()
	{
		this.click_on_requester.click();
	}

	//method for typing the requester name
	public void typerequesteurname(String name) throws InterruptedException
	{
		Thread.sleep(2000);
		this.requesteruname.sendKeys(name);
		this.requesteruname.sendKeys(Keys.ENTER);
	}

	//method for typing requester name
	public void typename(String tname) throws InterruptedException
	{ 
		Thread.sleep(2000);
		this.typename.sendKeys(tname);
	}

	//method for typing requester email	
	public void typeemail(String email) throws InterruptedException
	{
		Thread.sleep(2000);
		this.typeemail.sendKeys(email);
	}


	//method for typing requester mobile
	public void typemobile(String mobile) throws InterruptedException
	{
		Thread.sleep(2000);
		this.mobile.sendKeys(mobile);
	}

	//method for typing the subject
	public void typesubject(String subject) throws InterruptedException
	{
		this.subject.sendKeys(subject);
	}

	//method for selecting the status
	public void selectstatus()
	{
		this.status.click();
		Select Status=new Select (status);
		Status.selectByVisibleText("Open");
	}

	//method for selecting the priority
	public void selectpriority()
	{
		this.clickpriority.click();
		Select selec=new Select(clickpriority);
		selec.selectByVisibleText("High");	
	}

	//method for selecting the helptopic
	public void selecthelptopic()
	{
		this.clickhelptopic.click();
		Select selec=new Select(clickhelptopic);
		selec.selectByVisibleText("Support query");
	}

	//method for selecting the department
	public void selectdepartment()
	{
		this.selectdepartment.click();
		Select dept=new Select(selectdepartment);
		dept.selectByVisibleText("Operation");
	}

	//method for selecting the type
	public void selecttype()
	{
		this.selecttype.click();
		Select selec=new Select(selecttype);
		selec.selectByVisibleText("Question");
	}

	//method for writing the description
	public void givedescription() throws InterruptedException, AWTException 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,900)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='cke_button_icon cke_button__specialchar_icon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='T']")).click();
		Thread.sleep(2500);
		this.clicksubmit.click();
	}
	
    //click on agent profile
	public void clicklogoutagent()
	{
		this.logoutagent.click();
	}
	
	//click on logout
	public void clicklogoutbttn()
	{
		this.clickonlogoutbtn.click();
	}
}
