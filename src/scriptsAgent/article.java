package scriptsAgent;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.Article;

public class article extends Basetest 
{
	@Test
	public void test() throws InterruptedException
	{
		Article art=new Article(driver);
		art.clicklogin11();
		art.username11(input.getdata(excel, "sheet1", 0, 1));
		art.passsword11(input.getdata(excel, "sheet1", 1, 1));
		art.clicklogin21();
		art.clicktoolspage();
		Thread.sleep(2000);
		art.clickknowledgebase();
		art.clickarticle();
	}

}
