package emailconfigurationpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Basetest;
import Generic.selec;

public class EmailConfigurationPage extends Basetest{
	
	//Login In NavigationBar
	@FindBy(xpath=".//*[@id='hid']/li/a/i")
	private WebElement Basiclogin;
	
	//Username
	@FindBy(id="user_name")
	private WebElement Username;
	
	//Password 
	@FindBy(id="password")
	private WebElement Password;
	
	//For login button
	@FindBy(id="default-login-button")
	private WebElement DefLoginButton;
	
	
	//Email configuration via link after installation
	@FindBy(xpath="//a[text()='Click here to configure the mail.']")
	private WebElement EmailLinkAfterInst;
	
	
	//Admin Panel
	@FindBy(xpath="//a[text()='Admin Panel']")
	private WebElement ClickAdminPanel;
	
	
	//Email
	@FindBy(xpath="//i[@class='fa fa-envelope-o fa-stack-1x']")
	private WebElement ClickEmail;
	
	
	//Create Email
	@FindBy(xpath="//a[@class='btn btn-primary pull-right']")
	private WebElement ClickOnCreateEmail;
	
	//Enter email
	@FindBy(xpath="//input[@class='form-control' and @type='email']")
	private WebElement EnterEmail;
	
	//Enter name
	@FindBy(xpath="//input[@class='form-control' and @type='text']")
	private WebElement EnterName;
		
	//Enter password
	@FindBy(xpath="//input[@class='form-control' and @type='password']")
	private WebElement EnterPassword;
	
	//Disabling incoming
	@FindBy(xpath="//label[@class='vue-switcher vue-switcher--bold vue-switcher-theme--bootstrap vue-switcher-color--success']/input[@type='checkbox']")
	private WebElement DisableIncoming;
	
	//Disable outgoing
	@FindBy(xpath="html/body/div[1]/div/section[2]/div/div/div/div[4]/div[1]/div/label/input")
	private WebElement DisableOutgoing;
	
	//Ticket Settings
	
	
	//Incoming Details//
	
	//For fetching Protocol
	@FindBy(name="fetching_protocol")
	private WebElement SelectImap;
	
	//For HostName as Imap
	@FindBy(xpath="html/body/div[1]/div/section[2]/div/div/div/div[3]/div[2]/div/div[2]/div/input")
	private WebElement EnterIncHostName;
	
	//For Port
	@FindBy(xpath="html/body/div[1]/div/section[2]/div/div/div/div[3]/div[2]/div/div[3]/div/input")
	private WebElement EnterIncomingPort;
	
	//For Encryption as SSL
	@FindBy(name="fetching_encryption")
	private WebElement SelectFetchingEncryption;

	
	//Outgoing Details//
	
	//For transfer Protocol
	@FindBy(name="sending_protocol")
	private WebElement SelectSmtp;
	
	//For HostName as Smtp
	@FindBy(xpath="html/body/div[1]/div/section[2]/div/div/div/div[4]/div[2]/div/div[2]/div/input")
	private WebElement EnterOutHostName;
	
	//For Port
	@FindBy(xpath="html/body/div[1]/div/section[2]/div/div/div/div[4]/div[2]/div/div[3]/div/input")
	private WebElement EnterOutgoingPort;
	
	//For Encryption as SSL
	@FindBy(name="sending_encryption")
	private WebElement SelectSendingEncryption;
	
	
	//Save button
	@FindBy(xpath="//button[@class='btn btn-primary update-btn']")
	private WebElement ClickOnSave;
	
	//Update button
	@FindBy(xpath="//button[@class='btn btn-primary update-btn']")
	private WebElement ClickOnUpdate;

	
	public EmailConfigurationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void BasicLogin(){
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		this.Basiclogin.click();
	}
	
	public void EnterUsername(String un){
		this.Username.sendKeys(un);
	}
	
	public void EnterPassword(String pwd){
		this.Password.sendKeys(pwd);
	}
	
	public void ClickOnDefLogin(){
		this.DefLoginButton.click();
	}
	
	public void ClickOnEmailLinkAftInstallation(){
		this.EmailLinkAfterInst.click();
	}

	public void ClickAdminPanel(){
		this.ClickAdminPanel.click();
	}

	public void ClickOnEmail(){
		this.ClickEmail.click();
	}
	
	public void ClickOnCreateEmail(){
		this.ClickOnCreateEmail.click();
	}
	
	public void EnterEmail(String email){
		this.EnterEmail.sendKeys(email);
	}
	
	public void EnterEName(String ename){
		this.EnterName.sendKeys(ename);
	}
	
	public void EnterEPassword(String epwd){
		this.EnterPassword.sendKeys(epwd);
	}
	
	public void DisablingIncoming(){
		this.DisableIncoming.click();
	}

	public void DisablingOutgoing(){
		this.DisableOutgoing.click();
	}

	public void IncomingDetails(){
		selec simap = new selec();
		simap.selectbyvalue(SelectImap,"imap");
	}
	
	
	

}
