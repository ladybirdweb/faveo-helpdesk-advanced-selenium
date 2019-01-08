package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.widgets;

public class Widget extends Basetest
{
	@Test
	public void Test13()
	{
		widgets widget=new widgets(driver);
		widget.clicklogin();
		widget.username(input.getdata(excel, "sheet1", 0, 1));
		widget.passsword(input.getdata(excel, "sheet1", 1, 1));
		widget.clicklogin1();
		widget.clickAdminpanel();
		widget.clickwidgets();
	}

}
