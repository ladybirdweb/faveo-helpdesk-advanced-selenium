package scriptsAgent;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.addarticle;

public class AddArticle extends Basetest 
{
@Test
public void test() throws InterruptedException
{
	addarticle article=new addarticle(driver);
	article.clicklogin11();
	article.username11(input.getdata(excel, "sheet1", 0, 1));
	article.passsword11(input.getdata(excel, "sheet1", 1, 1));
	article.clicklogin21();
	article.clicktoolspage();
	Thread.sleep(2000);
	article.clickknowledgebase();
	article.clickarticle();
	Thread.sleep(2000);
	article.clickAddarticle();
}
}
