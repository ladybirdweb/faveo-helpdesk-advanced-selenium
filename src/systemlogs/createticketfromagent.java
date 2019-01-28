package systemlogs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Basepage;

public class createticketfromagent extends Basepage 
{

	//click on create ticket
	@FindBy(xpath="//*[@id=\"side-bar\"]/li[2]/a")
	private WebElement sidebarcreateticket;
	
	//
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public createticketfromagent(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);

	}
	

}
