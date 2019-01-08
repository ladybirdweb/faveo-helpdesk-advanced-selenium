package scriptsAgent;

import Generic.Basetest;
import Generic.input;
import Page.allarticles;

import org.testng.annotations.Test;

public class Allarticles extends Basetest
{
	@Test
	public void Test() throws InterruptedException
	{
		allarticles article=new allarticles(driver);
		article.clicklogin11();
		article.username11(input.getdata(excel, "sheet1", 0, 1));
		article.passsword11(input.getdata(excel, "sheet1",1, 1));
		article.clicklogin21();
		article.clicktoolspage();
		Thread.sleep(2000);
		article.clickknowledgebase();
		article.clickarticle();
		Thread.sleep(2000);
		article.clickallarticles();
		
	}

}
