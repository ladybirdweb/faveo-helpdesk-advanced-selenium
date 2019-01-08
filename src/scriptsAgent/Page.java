package scriptsAgent;

import Generic.Basetest;
import Generic.input;
import Page.pages;

import org.testng.annotations.Test;

public class Page extends Basetest 
{
	@Test
	public void Test() throws InterruptedException
	{
		pages page=new pages(driver);
		page.clicklogin11();
		page.username11(input.getdata(excel, "sheet1", 0, 1));
		page.passsword11(input.getdata(excel, "sheet1", 1, 1));
		page.clicklogin21();
		page.clicktoolspage();
		Thread.sleep(2000);
		page.clickknowledgebase();
		page.clickpages();
		Thread.sleep(2000);
		page.clickaddpages();
		Thread.sleep(2000);
		page.clickallpages();
		
	}

}
