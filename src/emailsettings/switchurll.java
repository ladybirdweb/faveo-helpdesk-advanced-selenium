package emailsettings;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Basepage;

public class switchurll extends Basepage 
{
  
	@FindBy(xpath="//a[text()='Home']")
    private WebElement homebtn;
	
	  public switchurll(WebDriver driver) {
			super(driver);
			PageFactory.initElements(driver, this);
		}
	
    
    
    

	public void inspecthomebtn()
	{
		this.homebuttonvisiblity(homebtn);
	}
	
	
	
	
	
	
	
	

}
