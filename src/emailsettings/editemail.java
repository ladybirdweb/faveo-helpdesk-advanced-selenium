package emailsettings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Basepage;

public class editemail  extends Basepage
{
	@FindBy(xpath="//i[@class='fa fa-edit']")
	private WebElement clickedit;
	
	@FindBy(xpath="//input[@type='password']")
    private WebElement typepassword;
	
	public editemail(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
    public void clickedit()
    {
    	this.clickedit.click();
    }
    public void editpassword(String password)
    {
    	this.typepassword.sendKeys(password);
    }
	
}
