package logsfunctionalitypage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Basepage;

public class register extends Basepage 
{

//click on register	
@FindBy(xpath="//span[text()='Register']")
private WebElement clickregister;

//enter the firstname
@FindBy(xpath="//input[@name='textfield0']")
private WebElement firstname;

//enter the lastname
@FindBy(xpath="//input[@name='textfield1']")
private WebElement lastname;

//enter the email
@FindBy(xpath="//input[@name='mail4']")
private WebElement email;

//clcik on register button
@FindBy(xpath="//button[text()='Register']")
private WebElement clickregisterbutton;

	
public register(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

//method to click register button
public void clickregisterbutton()
{
	this.clickregister.click();
}

//method to enter the firstname
public void enterfirstname(String fname)
{
	this.firstname.sendKeys(fname);
}

//method to enter the lastname
public void enterlname(String lname)
{
	this.lastname.sendKeys(lname);
}

//method to enter the email
public void enteremail(String email)
{
	this.email.sendKeys(email);
}

//method to click register button
public void hitregister()
{
	this.clickregisterbutton.click();
}
























}
