package logsfunctionalitypage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class selectcannedresponse 
{
	//select canned response
	@FindBy(xpath="//li[@class='select2-search select2-search--inline']//input[@placeholder='Select a canned response']")
	private WebElement selectresponse;
	
	public void selectcannedresponsedropdown() throws InterruptedException
	{
		Thread.sleep(3000);
		this.selectresponse.click();
		Select selec=new Select(selectresponse);
		selec.selectByVisibleText("this is test response");
	}
}
