package emailsettings;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Generic.Basepage;

public class createemail extends Basepage 
{
	    @FindBy(xpath="//i[@class='fa fa-envelope-o fa-stack-1x']")
		private WebElement emailpanel;
	    
	    @FindBy(xpath="//a[@class='btn btn-primary pull-right']")
		private WebElement clickcreateemail;
	    
	    @FindBy(xpath="//input[@class='form-control' and @type='email']")
		private WebElement typeemail;
	    
	    @FindBy(xpath="//input[@class='form-control' and @type='text']")
		private WebElement typename;
		
		@FindBy(xpath="//input[@class='form-control' and @type='password']")
		private WebElement typepassword;
		
		@FindBy(xpath="//select[@name='fetching_protocol']")
		private WebElement fetchingprotocol;
		
		//@FindBy(xpath="//div[@id='Host name']//div//input[@class='form-control']")
		//private WebElement hostname;
		
		@FindBy(xpath="html/body/div[1]/div/section[2]/div/div/div/div[3]/div[2]/div/div[3]/div/input")
		private WebElement port;
		
		@FindBy(xpath="//select[@name='fetching_encryption']")
		private WebElement encryption;
		
		@FindBy(xpath="//select[@name='sending_protocol']")
		private WebElement Transferprotocol;
		
		
		@FindBy(xpath="html/body/div[1]/div/section[2]/div/div/div/div[4]/div[2]/div/div[2]/div/input")
		private WebElement outgoinghostname;
		
		@FindBy(xpath="html/body/div[1]/div/section[2]/div/div/div/div[4]/div[2]/div/div[3]/div/input")
		private WebElement outgoingportnumber;
		
		@FindBy(xpath="//select[@name='sending_encryption']")
		private WebElement outgoingencryption; 
		
		@FindBy(xpath="//span[@class='fa fa-refresh']")
		private WebElement clickupdate;
		
		public createemail(WebDriver driver) {
			super(driver);
			PageFactory.initElements(driver, this);	
		}
			public void clickemailpanel()
			{
				driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
				this.emailpanel.click();
			}
			public void clickcreateemail()
			{
				this.clickcreateemail.click();
			}
			
			public void typeemail(String email)
			{
				this.typeemail.sendKeys(email);
			}
			
			public void typename(String name)
			{
				this.typename.sendKeys(name);
			}
			
			public void typepassword(String password)
			{
				this.typepassword.sendKeys(password);
			}
		
			public void clickfetchingprotocol() throws InterruptedException, AWTException
			{
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			Select selec=new Select(fetchingprotocol);
			selec.selectByVisibleText("IMAP");
			this.fetchingprotocol.submit();
			this.fetchingprotocol.click();
			Thread.sleep(2000);
			}
			//public void hostname(String hostname) throws InterruptedException
			//{
				//Thread.sleep(2000);
			//JavascriptExecutor js = (JavascriptExecutor) driver;
			//js.executeScript("window.scrollBy(0,1200)");
			//driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
			//driver.findElement(By.xpath("//div[@id='Host name']//div//input[@class='form-control']"));
			//this.hostname.sendKeys(hostname);
			//}
			public void port(String port) throws  AWTException, InterruptedException
			{
				//JavascriptExecutor js = (JavascriptExecutor) driver;
				//js.executeScript("window.scrollBy(0,1200)");
			   driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS); 
				driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div/div/div[3]/div[2]/div/div[3]/div/input"));
			    this.port.sendKeys(port);
			}
			public void clickssl()
			{
				driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
				Select selec=new Select(driver.findElement(By.xpath("//select[@name='fetching_encryption']")));
				selec.selectByVisibleText("SSL");
				this.encryption.click();
			}
			public void clicktransferprotocol()
			{
				//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
				Select selec=new Select(driver.findElement(By.xpath("//select[@name='sending_protocol']")));
				selec.selectByVisibleText("SMTP");
				this.Transferprotocol.click();
			}
			public void outgoinghostname(String outhost)
			{
				driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div/div/div[4]/div[2]/div/div[2]/div/input"));
				this.outgoinghostname.sendKeys(outhost);
			}
		    
			public void outgoingportnumber(String outportnumber)
			{
				driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div/div/div[4]/div[2]/div/div[3]/div/input"));
				this.outgoingportnumber.sendKeys(outportnumber);
			}
			
			public void outgoingencryption()
			{
				driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
				Select selec=new Select(driver.findElement(By.xpath("//select[@name='sending_encryption']")));
				selec.selectByVisibleText("SSL");
			}
			
			public void clickupdate()
			{
				driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
				this.clickupdate.click();
			}
}
			

	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
