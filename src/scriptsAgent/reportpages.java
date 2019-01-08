package scriptsAgent;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.reportpage;

public class reportpages extends Basetest 
{
@Test
public void Test1()
{
	reportpage page=new reportpage(driver);
	page.clicklogin11();
	page.username11(input.getdata(excel, "sheet1", 0, 1));
	page.passsword11(input.getdata(excel, "sheet1", 1, 1));
	page.clicklogin21();
	page.clickreportpage();
}
}
