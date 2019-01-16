package installationpage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Basetest;

public class InstallationPageLocally extends Basetest {

	@FindBy(xpath="//h1[text()='Faveo Probe']")
	private WebElement Title;
	
	@FindBy(id="submitme")
	private WebElement Continue;
	
	@FindBy(id="Acceptme")
	private WebElement Accept;
	
	@FindBy(id="submitme")
	private WebElement LicenseContinue;
	
	@FindBy(name="host")
	private WebElement Host;
	
	@FindBy(name="port")
	private WebElement Port;
	
	@FindBy(name="databasename")
	private WebElement Databasename;
	
	@FindBy(name="username")
	private WebElement Username;
	
	@FindBy(id="dummy-data")
	private WebElement Dummydata;
	
	@FindBy(id="submitme")
	private WebElement ContinueDB;
	
	@FindBy(id="submitme")
	private WebElement DBSetupDone;
	
	@FindBy(name="firstname")
	private WebElement Firstname;
	
	@FindBy(name="Lastname")
	private WebElement Lastname;
	
	@FindBy(name="email")
	private WebElement Email;
	
	@FindBy(name="username")
	private WebElement AdminUsername;
	
	@FindBy(name="password")
	private WebElement Password;
	
	@FindBy(name="confirm_password")
	private WebElement ConfirmPassword;
	
	
	@FindBy(xpath=".//*[@id='postaccount']/div/table[3]/tbody/tr[2]/td[2]/div/div/div/a/span")
	private WebElement SelectTimezone;
	
	@FindBy(xpath=".//*[@id='postaccount']/div/table[3]/tbody/tr[2]/td[2]/div/div/div/div/div/input")
	private WebElement EnterTimezone;
	
	@FindBy(xpath=".//*[@id='postaccount']/div/table[3]/tbody/tr[2]/td[2]/div/div/div/div/ul/li[2]")
	private WebElement PickTimezone;
	
	@FindBy(id="submitme")
	private WebElement LocaleInfoContinue;
	

	@FindBy(id="productKey1")
	private WebElement ProductKey1;
	
	@FindBy(id="productKey2")
	private WebElement ProductKey2;
	
	@FindBy(id="productKey3")
	private WebElement ProductKey3;
	
	@FindBy(id="productKey4")
	private WebElement ProductKey4;
	
	@FindBy(id="submitme")
	private WebElement LicenseCodeContinue;
	
	@FindBy(xpath="//a[text()='Login to Faveo']")
	private WebElement LoginFinalStep;
	
	
	public InstallationPageLocally(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void probePage(){
    Continue.click();
	}
	
	public void acceptCheckbox(){
		Accept.click();
	}
	
	public void licenseAgreement(){
	    Continue.click();
	}
	
	public void setconfirmPwd(){
		LicenseContinue.click();
	}
			
	public void dbSetup(String host,String dbname,String username){
		Host.sendKeys(host);
		//Port.sendKeys(port);
		Databasename.sendKeys(dbname);
		Username.sendKeys(username);
		ContinueDB.click();
	}
	
	//Wait for 2min
	
	
	public void dbSetupDone(){
		DBSetupDone.click();
	}
	
	public void localeInformation(String fname,String lname,String email,String uname,String pwd,String cpwd,String tzone){
		Firstname.sendKeys(fname);
		Lastname.sendKeys(lname);
		Email.sendKeys(email);
		AdminUsername.sendKeys(uname);
		Password.sendKeys(pwd);
		ConfirmPassword.sendKeys(cpwd);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		SelectTimezone.click();
		EnterTimezone.sendKeys(tzone);
		PickTimezone.click();
		LocaleInfoContinue.click();
		
	}
	
	public void licenseCode(String pk1,String pk2,String pk3,String pk4){
		ProductKey1.sendKeys(pk1);
		ProductKey2.sendKeys(pk2);
		ProductKey3.sendKeys(pk3);
		ProductKey4.sendKeys(pk4);
		LicenseCodeContinue.click();
	}
	
	
	public void finalStep(){
		LoginFinalStep.click();
	}
	
	

}
