package logsfunctionalitypage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Generic.Basepage;

public class Apply_approval_Workflow_page extends Basepage
{
	//go to admin panel and click on approval workflow
	@FindBy(xpath="//p[text()='Approval Workflow']")
	private WebElement clickapprovalworkflow;
	
	//click on create approval workflow
	@FindBy(xpath="//a[@class='btn btn-primary right']")
	private WebElement createapprovalworkflow;
	
	//give the approval workflow name
	@FindBy(xpath="//div[@id='approval-workflow-name']//input[@id='text-field']")
	private WebElement typeapprovalworkflowname;
	
	//select status on approve
	@FindBy(xpath="//*[@id='Status on Approve']/div")
	private WebElement selectstatusapprove;
	
	//select status on deny
	@FindBy(xpath="//*[@id=\"Status on Deny\"]/div")
	private WebElement selectstatusondeny;
	
	//enter the level 1 name
	@FindBy(xpath="//div[@class='row margin-auto margin-top-10']//input[@id='text-field']")
	private WebElement level1name;
	
	//select matcher
	@FindBy(xpath="//select[@name='level-match-0']")
	private WebElement selectmatcher;
	
	//select users
	@FindBy(xpath="//*[@id=\"Users\"]/div")
	private WebElement selectusers;
	
	//click on save 
	@FindBy(xpath="//button[@id='submit-workflow']")
	private WebElement clicksave;
	
	//click on agent
	@FindBy(xpath="//ul[@class='nav navbar-nav navbar-left']")
	private WebElement clickonagent;

	//click on approval workflow
	@FindBy(xpath="//button[@id='apply-approval-worflow-button']")
	private WebElement clickapplyapproval_work_flow;
	
	//type the approval workflow
	@FindBy(xpath="//div[@id='Apply Workflow']//div[@class='vs__selected-options']")
	private WebElement typeapprovalworkflow;
	
	//click on apply
	@FindBy(xpath="//button[@id='apply-approval-workflow-submit']")
	private WebElement clickapply;

	public Apply_approval_Workflow_page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	
	}
	
	//method for clicking approval workflow
	public void clickapproval() throws InterruptedException
	{
            Actions act=new Actions(driver);
            act.moveToElement(driver.findElement(By.xpath("//p[text()='Approval Workflow']"))).click().build().perform();

	}
	
	//method for clicking create approval workflow
	public void clickcreateapprovalworkflow() throws InterruptedException
	{
		Thread.sleep(4000);
		this.createapprovalworkflow.click();
	}
	
	//method for approval workflow name
	public void typeapprovalworkflowname()
	{
		this.typeapprovalworkflowname.sendKeys("this is test");
	}
	
	//method for selecting status on approve
	public void selectstatusonapprove() throws InterruptedException, AWTException
	{
		this.selectstatusapprove.click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_O);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);		
	}
	
	//method for status for deny
	public void selectstatusondeny() throws AWTException, InterruptedException
	{
		this.selectstatusondeny.click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_R);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		
	}
	
	//method for selecting level1 name
	public void selectlevel_1name()
	{
		this.level1name.sendKeys("this is refg");
	}
	
	//method for select matcher
	public void selectmatcher() throws AWTException, InterruptedException
	{
		this.selectmatcher.click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_A);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
	}
	
	//methos for selecting the users
	public void selectusers() throws AWTException, InterruptedException
	{
		this.selectusers.click();
	    Robot r=new Robot();
	    r.keyPress(KeyEvent.VK_C);
	    Thread.sleep(3000);
	    r.keyPress(KeyEvent.VK_ENTER);
	    this.selectusers.click();
	}
	
	//click on save button
	public void clicksavebtn() throws InterruptedException
	{
		Thread.sleep(3000);
		this.clicksave.click();
	}

	//click on agent
	public void clickagent()
	{
		this.clickonagent.click();
	}
	
	//click on aapplyapproval workflow
	public void clickapplyapprovalflow()
	{
		this.clickapplyapproval_work_flow.click();
	}
	
	//method for typing approval workflow
	public void typeapprovalworkflow() throws AWTException, InterruptedException
	{
		this.typeapprovalworkflow.click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
	}
	
	//method for clicking on apply
	public void clickapply()
	{
		this.clickapply.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
