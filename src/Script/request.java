package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.requestform;

public class request extends Basetest
{
@Test
public void Test10() throws InterruptedException
{
	requestform form=new requestform(driver);
	form.clicklogin();
	form.username(input.getdata(excel, "sheet1", 0, 1));
	form.passsword(input.getdata(excel, "sheet1", 1, 1));
	form.clicklogin1();
	form.clickAdminpanel();
	form.requesterform();
}
}
