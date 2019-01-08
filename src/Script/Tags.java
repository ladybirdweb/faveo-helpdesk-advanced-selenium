package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.tags;

public class Tags extends Basetest 
{
@Test
public void Test17()
{
	tags tag=new tags(driver);
	tag.clicklogin();
	tag.username(input.getdata(excel, "sheet1", 0, 1));
	tag.passsword(input.getdata(excel, "sheet1", 1, 1));
	tag.clicklogin1();
	tag.clickAdminpanel();
	tag.clicktags();
}
}
