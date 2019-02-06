package logsfunctionalitypage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import Generic.Basepage;

public class Logs_Assign_ticket_page extends Basepage
{
	//click on assign ticket
	@FindBy(xpath="//div[@class='col-md-12 all-event']//button[@id='Edit_Ticket']")
	private WebElement clickassign;
	
	//click on assign to
	@FindBy(xpath="/html/body/div[1]/div/section[2]/div/div[2]/div/div[2]/div[6]/div/div[2]/div[2]/div[2]/div/section/div[2]/div[1]/div/div[2]/div/div[2]/div[2]/div[2]/div/div/form/select")
	private WebElement clickassigndropdown;
	
	//click on assign popup
	@FindBy(xpath="//*[@id=\"timelineAssign\"]/div[2]/div/div[3]//input[@value='Assign']")
	private WebElement clickonassignpopup;
	
	//click on reply button
	@FindBy(xpath="//button[@id='replybtn']")
	private WebElement clickupdatebutton;
	
	//click on change status
	@FindBy(xpath="//div[@ticketobj='[object Object]']//button[@class='btn btn-sm btn-default dropdown-toggle']")
	private WebElement clickonchangestatus;
	
	//give a comment
	@FindBy(xpath="//textarea[@name='comment']")
	private WebElement givecomment;
	
	//click on yes
	@FindBy(xpath="//*[@id=\"timelineStatus\"]/div/div/div/div[3]/button[4]")
    private WebElement clickyes;
	
	public Logs_Assign_ticket_page(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//method for clicking on assign button
	public void clickonassign()
	{
		this.clickassign.click();
	}
	
	//method for clicking from assignto dropdown
	public void clickonassigndropdown() throws InterruptedException
	{
		Thread.sleep(3000);
		this.clickassigndropdown.click();
		Select sele=new Select(clickassigndropdown);
		sele.selectByVisibleText("Agent Agent");
	}
	
	//method for clicking on assignpopup
	public void clickonassignpopup() throws InterruptedException
	{
		Thread.sleep(3000);
		this.clickonassignpopup.click();
	}
	
	//method for clicking on update
	public void clickupdatebtn()
	{
		this.clickupdatebutton.click();
	}
	
	//method for changing the status
	public void clickchangestatus()
	{
		this.clickonchangestatus.click();
		driver.findElement(By.xpath("//i[@class='fa fa-check-circle-o']")).click();
	}
	
	//method for entering the comment
	public void entercomment()
	{
	   this.givecomment.sendKeys("this is test message");	
	}
	
	//method for clicking on yes button
	public void clickyes()
	{
		this.clickyes.click();
	}
	
	
	//method for checking the category
	public void checkcategory() throws InterruptedException
	{
		//for rows
		Thread.sleep(3500);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,5900)");
		String beforexpath="/html/body/div[1]/div/section[2]/div/div/div/div[2]/div[4]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[2]/table/tbody/tr[";
		String afterxpath="]/td[1]";
		
		for(int i=1;i<=7;i++)
		{
			String actualxpath=beforexpath+i+afterxpath;
			WebElement element=driver.findElement(By.xpath(actualxpath));
			if(element.getText().equals("ticket-update"))
			{
				System.out.print("category update to:" +element.getText());
				break;
			}
			else if(element.getText().equals("user-create"))
			{
				System.out.print("category update to: " +element.getText());
				break;
			}
			else if(element.getText().equals("ticket create"))
			{
				System.out.print("category update to: " +element.getText());
				break;
			}
			else if(element.getText().equals("default"))
			{
				System.out.print("category update to :"+element.getText());
				break;
			}
			else if(element.getText().equals("user-update"))
			{
				System.out.print("category update to :"+element.getText());
				break;
			}
		}
		System.out.print("**");
		
		String beforexpathsub="/html/body/div[1]/div/section[2]/div/div/div/div[2]/div[4]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[2]/table/tbody/tr[";
		String afterxpathsub="]/td[4]";
		for(int j=1;j<=7;j++)
		{
			String actualxpathsub=beforexpathsub+j+afterxpathsub;
			WebElement elementsub=driver.findElement(By.xpath(actualxpathsub));
			System.out.println("staus is: "+elementsub.getText());
			
		}
		
	}

	
	
	
}
