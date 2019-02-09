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

public class Logs_reply_as_agent_page extends Basepage 
{

	//click on inbox
	@FindBy(xpath="//span[@class='info-box-icon bg-aqua']")
    private WebElement clickinbox;
	
	//click on ticket
	@FindBy(xpath="/html/body/div[1]/div/section[2]/div/div[2]/div/div[2]/div[4]/table/tbody/tr[1]/td[3]/div/h3/div/a")
	private WebElement clickticket;
	
	
	//click on update
	@FindBy(xpath="//button[@id='replybtn']")
	private WebElement clickupdate;
	
	//select canned response
	@FindBy(xpath="//*[@id=\"t1\"]/div[3]/div/div[2]/span/span[1]/span/ul")
	private WebElement selectcannedresponse;
	
	
	public Logs_reply_as_agent_page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	//method for clicking on inbox
	public void clickoninbox()
	{
		this.clickinbox.click();
	}
	
	//method for clicking on ticket
	public void clickonticket() throws InterruptedException
	{
		Thread.sleep(3500);
		this.clickticket.click();
	}
	
	//method for giving the description
	public void givedescriptionreplyagent() throws InterruptedException
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
		Thread.sleep(3000);
	}
	
	// select canned response
	public void selectcannedresponsedropdown()
	{
		this.selectcannedresponse.click();
		Select selec=new Select(selectcannedresponse);
		selec.selectByVisibleText("laptop is not getting switched on");
	}
	
	
	//click on update
	public void clickupdate()
	{
		this.clickupdate.click();
		driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
