package Page;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Basepage1;

public class faveoagentpage extends Basepage1 
{
	//login as admin
	@FindBy(xpath=".//*[@id='hid']/li/a/i")
	private WebElement login;
	@FindBy(id="user_name")
	private WebElement un;
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement pw;
	@FindBy(xpath="//button[@class='login-button btn btn-primary btn-block btn-flat']")
	private WebElement login1;
	@FindBy(xpath="//a[contains(text(),'Admin Panel')]")
	private WebElement Adminpanel;
	
	//click on agents
	@FindBy(xpath="/html/body/div[1]/div/section[2]/div[1]/div[2]/div/div/div[1]/div/div/a/span/i")
	private WebElement Agents;
	
	//click on view agent
	@FindBy(xpath="//*[@id='chumper']/tbody/tr[1]/td[8]/a[1]")
	private WebElement clickviewagent;
	
	//click on change password
	@FindBy(xpath="/html/body/div[1]/div/section[2]/div[4]/div[4]/div/div[1]/div/div/div[1]/button[1]")
	private WebElement clickchangepassword;
	
	//enter the new password
	@FindBy(xpath="//div[@class='input-group']//input[@name='change_password']")
	private WebElement enternewpassword;
	
	
	//click on submit
	@FindBy(xpath="//input[@id='savepassword']")
	private WebElement clicksubmitbutton;
	
	public faveoagentpage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	    //click on login
		public void clicklogin()
		{
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			this.login.click();
		}
		public void username(String username)
		{
			this.un.sendKeys(username);
		}
		public void passsword(String pwd)
		{
			this.pw.sendKeys(pwd);
		}
		public void clicklogin1()
		{
			this.login1.click();
		}
		public void clickAdminpanel() throws InterruptedException
		{
			Thread.sleep(3500);
			this.Adminpanel.click();
		}
		
		//method click on agents
		public void clickAgents() throws InterruptedException
		{
			Thread.sleep(3500);
			this.Agents.click();
		}
		
		//method click on view agent
		public void clickviewagent()
		{
			this.clickviewagent.click();
		}
		
		//method for changing the password
		public void clickchangepassword()
		{
			this.clickchangepassword.click();
		}
		
		//enter new password
		public void enternewpassword() throws InterruptedException
		{
			Thread.sleep(3500);
			String s = RandomStringUtils.randomAlphanumeric(7);
			this.enternewpassword.sendKeys(s);
		}
		
		//click submitbutton
		public void clicksubmitbutton()
		{
			this.clicksubmitbutton.click();
		}
		
}
