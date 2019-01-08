package scriptsAgent;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.addarticletemplate;

public class addarticletemplates extends Basetest 
{
	@Test
	public void test() throws InterruptedException
	{
		addarticletemplate template=new addarticletemplate(driver);
		template.clicklogin11();
		template.username11(input.getdata(excel, "sheet1", 0, 1));
		template.passsword11(input.getdata(excel, "sheet1", 1, 1));
		template.clicklogin21();
		template.clicktoolspage();
		Thread.sleep(2000);
		template.clickknowledgebase();
		template.clickarticle();
		Thread.sleep(2000);
		template.clickaddarticletemplate();
	}

}
