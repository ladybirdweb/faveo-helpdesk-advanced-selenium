package logsfunctionalitypage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Generic.Basepage;

public class Logs_change_status_client_page extends Basepage 
{
	 //click on my ticket
	 @FindBy(xpath="/html/body/div[1]/div/div/div/div[1]/div/header/div/div[2]/nav/ul[2]/li[1]/a")
	 private WebElement clickonmyticket;
	 
     //click on a particular ticket
	 @FindBy(xpath="/html/body/div[1]/div/div/div/div[2]/div/div/div[1]/div[1]/div/div[2]/form/div/div/div[2]/div[2]/div/table/tbody[1]/tr/td[2]/a")
	 private WebElement clickticket;
	 
	 //click on change status
	 @FindBy(xpath="//button[@data-toggle='dropdown']")
	 private WebElement selectchangestatus;
	 
	 //click on the status
	// @FindBy(xpath="//i[@class='fa fa-check-circle-o']")
	// private WebElement changestatus;
	 
	
	public Logs_change_status_client_page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//method for clicking on my ticket
	public void clickmyticketclient() throws InterruptedException
	{
		Thread.sleep(3000);
		this.clickonmyticket.click();
	}

	//method for clicking on that particular ticket
	public void clickparticularticket() throws InterruptedException
	{
		Thread.sleep(3500);
		this.clickticket.click();
	}
	
	//method for clicking changing the status
	public void changestatus() throws InterruptedException
	{
		Thread.sleep(5000);
		this.selectchangestatus.click();
	}
	
	//method for clicking on the status
	public void selectstatus() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.id("bttn"));
		ele.click();
		Thread.sleep(3000);
		List<WebElement> s=  driver.findElements(By.xpath("//div[@class='btn-group open']//a//i[@class='fa fa-check-circle-o']"));
		System.out.println("the dropdown contains these many elements"+s.size());
		for(int i=0;i<s.size();i++)
		{
			if(s.get(i).getText().contains("Closed"))
			{
				s.get(i).click();
			}
	       
		}
		
	}

	
//	/html/body/div[1]/div/div/div/div[2]/div/div/div[1]/div[1]/div/div[2]/form/div/div/div[2]/div[2]/div/table/tbody[1]/tr/td[2]
	
	//method for clicking on that ticket
	public void clickonthatticket()
	{
		String beforeticket="/html/body/div[1]/div/div/div/div[2]/div/div/div[1]/div[1]/div/div[2]/form/div/div/div[2]/div[2]/div/table/tbody[1]/tr/td[";
		String afterticket="]";
		
		int i=2;
		String actualticket=beforeticket+i+afterticket;
		WebElement clickparticularticket=driver.findElement(By.xpath(actualticket));
		clickparticularticket.click();
	}
	
	
	
}
