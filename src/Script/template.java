package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.templates;

public class template extends Basetest 
{
	@Test
	public void test6()
	{
		templates template=new templates(driver);
		template.clicklogin();
		template.username(input.getdata(excel, "sheet1", 0, 1));
		template.passsword(input.getdata(excel, "sheet1", 1, 1));
		template.clicklogin1();
		template.clickAdminpanel();
		template.clicktemplate();
	}
}
