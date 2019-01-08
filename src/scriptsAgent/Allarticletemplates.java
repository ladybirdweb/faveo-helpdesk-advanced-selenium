package scriptsAgent;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.allarticletemplate;

public class Allarticletemplates extends Basetest
{
	@Test
	public void Test() throws InterruptedException
	{
    allarticletemplate temp=new allarticletemplate(driver);
    temp.clicklogin11();
    temp.username11(input.getdata(excel, "sheet1", 0, 1));
    temp.passsword11(input.getdata(excel, "sheet1", 1, 1));
    temp.clicklogin21();
    temp.clicktoolspage();
    Thread.sleep(2000);
    temp.clickknowledgebase();
    temp.clickarticle();
    Thread.sleep(2000);
    temp.clcikallarticletemplate();
	}

}
